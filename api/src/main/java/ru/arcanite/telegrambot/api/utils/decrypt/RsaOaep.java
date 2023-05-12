package ru.arcanite.telegrambot.api.utils.decrypt;

import lombok.experimental.UtilityClass;

import javax.crypto.Cipher;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.RSAPrivateCrtKeySpec;

@UtilityClass
public class RsaOaep {

    public byte[] decrypt(String privateKey, final byte[] secret) throws Exception {
        privateKey = privateKey.replace("-----BEGIN RSA PRIVATE KEY-----", "");
        privateKey = privateKey.replace("-----END RSA PRIVATE KEY-----", "");
        privateKey = privateKey.replaceAll("\\s+", "");
        final byte[] pkcs8EncodedBytes = Base64.decode(privateKey, 0);

        final KeyFactory kf = KeyFactory.getInstance("RSA");
        final PrivateKey privKey = kf.generatePrivate(getRSAKeySpec(pkcs8EncodedBytes));

        final Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
        cipher.init(Cipher.DECRYPT_MODE, privKey);
        return cipher.doFinal(secret);
    }

    private RSAPrivateCrtKeySpec getRSAKeySpec(byte[] keyBytes) throws IOException {
        DerParser parser = new DerParser(keyBytes);
        final Asn1Object sequence = parser.read();
        if (sequence.getType() != DerParser.SEQUENCE)
            throw new IOException("Invalid DER: not a sequence");
        parser = sequence.getParser();
        parser.read();
        final BigInteger modulus = parser.read().getInteger();
        final BigInteger publicExp = parser.read().getInteger();
        final BigInteger privateExp = parser.read().getInteger();
        final BigInteger prime1 = parser.read().getInteger();
        final BigInteger prime2 = parser.read().getInteger();
        final BigInteger exp1 = parser.read().getInteger();
        final BigInteger exp2 = parser.read().getInteger();
        final BigInteger crtCoef = parser.read().getInteger();
        return new RSAPrivateCrtKeySpec(modulus, publicExp, privateExp, prime1, prime2, exp1, exp2, crtCoef);
    }

    private class DerParser {

        // Classes
        public final static int UNIVERSAL = 0x00;
        public final static int APPLICATION = 0x40;
        public final static int CONTEXT = 0x80;
        public final static int PRIVATE = 0xC0;

        // Constructed Flag
        public final static int CONSTRUCTED = 0x20;

        // Tag and data types
        public final static int ANY = 0x00;
        public final static int BOOLEAN = 0x01;
        public final static int INTEGER = 0x02;
        public final static int BIT_STRING = 0x03;
        public final static int OCTET_STRING = 0x04;
        public final static int NULL = 0x05;
        public final static int OBJECT_IDENTIFIER = 0x06;
        public final static int REAL = 0x09;
        public final static int ENUMERATED = 0x0a;
        public final static int RELATIVE_OID = 0x0d;

        public final static int SEQUENCE = 0x10;
        public final static int SET = 0x11;

        public final static int NUMERIC_STRING = 0x12;
        public final static int PRINTABLE_STRING = 0x13;
        public final static int T61_STRING = 0x14;
        public final static int VIDEOTEX_STRING = 0x15;
        public final static int IA5_STRING = 0x16;
        public final static int GRAPHIC_STRING = 0x19;
        public final static int ISO646_STRING = 0x1A;
        public final static int GENERAL_STRING = 0x1B;

        public final static int UTF8_STRING = 0x0C;
        public final static int UNIVERSAL_STRING = 0x1C;
        public final static int BMP_STRING = 0x1E;

        public final static int UTC_TIME = 0x17;
        public final static int GENERALIZED_TIME = 0x18;

        protected InputStream in;

        public DerParser(final InputStream in) {
            this.in = in;
        }

        public DerParser(final byte[] bytes) throws IOException {
            this(new ByteArrayInputStream(bytes));
        }

        public Asn1Object read() throws IOException {
            final int tag = in.read();
            if (tag == -1)
                throw new IOException("Invalid DER: stream too short, missing tag");
            final int length = getLength();
            final byte[] value = new byte[length];
            final int n = in.read(value);
            if (n < length)
                throw new IOException("Invalid DER: stream too short, missing value");
            return new Asn1Object(tag, length, value);
        }

        private int getLength() throws IOException {
            final int i = in.read();
            if (i == -1)
                throw new IOException("Invalid DER: length missing");
            if ((i & ~0x7F) == 0) return i;
            final int num = i & 0x7F;
            if (i == 0xFF || num > 4)
                throw new IOException("Invalid DER: length field too big (" + i + ")");
            final byte[] bytes = new byte[num];
            final int n = in.read(bytes);
            if (n < num)
                throw new IOException("Invalid DER: length too short");
            return new BigInteger(1, bytes).intValue();
        }
    }

    private class Asn1Object {

        protected final int type;
        protected final int length;
        protected final byte[] value;
        protected final int tag;

        public Asn1Object(final int tag, final int length, final byte[] value) {
            this.tag = tag;
            this.type = tag & 0x1F;
            this.length = length;
            this.value = value;
        }

        public int getType() {
            return type;
        }

        public int getLength() {
            return length;
        }

        public byte[] getValue() {
            return value;
        }

        public boolean isConstructed() {
            return (tag & DerParser.CONSTRUCTED) == DerParser.CONSTRUCTED;
        }

        public DerParser getParser() throws IOException {
            if (!isConstructed())
                throw new IOException("Invalid DER: can't parse primitive entity");
            return new DerParser(value);
        }

        public BigInteger getInteger() throws IOException {
            if (type != DerParser.INTEGER)
                throw new IOException("Invalid DER: object is not integer");
            return new BigInteger(value);
        }
    }
}