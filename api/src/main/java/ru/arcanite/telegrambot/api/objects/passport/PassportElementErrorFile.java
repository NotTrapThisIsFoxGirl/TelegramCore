package ru.arcanite.telegrambot.api.objects.passport;

public class PassportElementErrorFile extends PassportElementErrorAbstractFile {

    public PassportElementErrorFile(final String type, final String fileHash, final String message) {
        super("file", type, fileHash, message);
    }
}