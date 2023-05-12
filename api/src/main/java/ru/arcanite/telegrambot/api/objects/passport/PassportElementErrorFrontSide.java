package ru.arcanite.telegrambot.api.objects.passport;

public class PassportElementErrorFrontSide extends PassportElementErrorAbstractFile {

    public PassportElementErrorFrontSide(final String type, final String fileHash, final String message) {
        super("front_side", type, fileHash, message);
    }
}