package ru.arcanite.telegrambot.api.objects.passport;

public class PassportElementErrorSelfie extends PassportElementErrorAbstractFile {

    public PassportElementErrorSelfie(final String type, final String fileHash, final String message) {
        super("selfie", type, fileHash, message);
    }
}