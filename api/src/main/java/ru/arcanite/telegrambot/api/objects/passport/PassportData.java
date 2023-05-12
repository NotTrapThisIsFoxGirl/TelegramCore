package ru.arcanite.telegrambot.api.objects.passport;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class PassportData implements BaseObject {

    private EncryptedPassportElement[] data;
    private EncryptedCredentials credentials;
}