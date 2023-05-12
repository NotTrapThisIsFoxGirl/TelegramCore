package ru.arcanite.telegrambot.api.objects.passport;

public class PassportElementErrorReverseSide extends PassportElementErrorAbstractFile {

    public PassportElementErrorReverseSide(final String type, final String fileHash, final String message) {
        super("reverse_side", type, fileHash, message);
    }
}