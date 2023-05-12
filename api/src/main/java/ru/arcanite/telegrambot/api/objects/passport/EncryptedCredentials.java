package ru.arcanite.telegrambot.api.objects.passport;

import lombok.Getter;
import ru.arcanite.telegrambot.api.utils.decrypt.Decrypt;

@Getter
public class EncryptedCredentials {

    private String data;
    private String hash;
    private String secret;

    public Credentials decrypt(final String privateKey) throws Exception {
        return Decrypt.decryptCredentials(privateKey, data, hash, secret);
    }
}