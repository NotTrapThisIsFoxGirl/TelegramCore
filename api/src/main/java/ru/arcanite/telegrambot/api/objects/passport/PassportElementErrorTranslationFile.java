package ru.arcanite.telegrambot.api.objects.passport;

public class PassportElementErrorTranslationFile extends PassportElementErrorAbstractFile {

    public PassportElementErrorTranslationFile(final String type, final String fileHash, final String message) {
        super("translation_file", type, fileHash, message);
    }
}