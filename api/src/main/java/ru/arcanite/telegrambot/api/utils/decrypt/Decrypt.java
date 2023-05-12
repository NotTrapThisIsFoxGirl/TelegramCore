package ru.arcanite.telegrambot.api.utils.decrypt;

import lombok.experimental.UtilityClass;
import ru.arcanite.telegrambot.api.objects.passport.Credentials;
import ru.arcanite.telegrambot.api.utils.GsonUtil;

import java.util.Arrays;

@UtilityClass
public class Decrypt {

    public Credentials decryptCredentials(final String privateKey, final String data, final String hash, final String secret) throws Exception {
        final byte[] s = decryptBase64(secret);
        final byte[] encryptedSecret = RsaOaep.decrypt(privateKey, s);

        final byte[] h = decryptBase64(hash);
        final SecretHash secretHash = new SecretHash(encryptedSecret, h);

        final byte[] d = decryptBase64(data);
        final byte[] encryptedData = decryptAes256Cbc(secretHash.key(), secretHash.iv(), d);
        final String credValue = new String(encryptedData);
        return GsonUtil.fromJson(credValue, Credentials.class);
    }

    public String decryptData(final String data, final String dataHash, final String secret) throws Exception {
        final byte[] d = decryptBase64(data);
        final byte[] encryptedData = decryptFile(d, dataHash, secret);
        return new String(encryptedData);
    }

    public byte[] decryptFile(final byte[] data, final String fileHash, final String secret) throws Exception {
        final SecretHash secretHash = new SecretHash(decryptBase64(secret), decryptBase64(fileHash));
        return decryptAes256Cbc(secretHash.key(), secretHash.iv(), data);
    }

    private byte[] decryptAes256Cbc(final byte[] key, final byte[] iv, final byte[] data) throws Exception {
        byte[] encryptedData = new Aes256Cbc(key, iv).decrypt(data);
        final int padding = encryptedData[0] & 0xFF;
        encryptedData = Arrays.copyOfRange(encryptedData, padding, encryptedData.length);
        return encryptedData;
    }

    private byte[] decryptBase64(final String value) {
        return Base64.decode(value, 0);
    }
}