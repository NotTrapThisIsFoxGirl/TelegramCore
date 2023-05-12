package ru.arcanite.telegrambot.api.utils.decrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class SecretHash {

    private final byte[] secretHash;

    public SecretHash(final byte[] secret, final byte[] hash) throws Exception {
        this.secretHash = decodeSha512(decodeConcat(secret, hash));
    }

    public byte[] key() {
        return Arrays.copyOfRange(secretHash, 0, 32);
    }

    public byte[] iv() {
        return Arrays.copyOfRange(secretHash, 32, 48);
    }

    private byte[] decodeSha512(final byte[] string) throws NoSuchAlgorithmException {
        final MessageDigest md = MessageDigest.getInstance("SHA-512");
        return md.digest(string);
    }

    private byte[] decodeConcat(final byte[]... arrays) {
        int length = 0;
        for (final byte[] array : arrays) {
            length += array.length;
        }
        final byte[] result = new byte[length];
        int pos = 0;
        for (final byte[] array : arrays) {
            for (final byte element : array) {
                result[pos] = element;
                pos++;
            }
        }
        return result;
    }
}