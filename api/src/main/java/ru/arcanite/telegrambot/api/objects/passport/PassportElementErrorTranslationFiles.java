package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PassportElementErrorTranslationFiles extends PassportElementError {

    @SerializedName("file_hashes")
    private final String[] fileHashes;

    public PassportElementErrorTranslationFiles(final String type, final String[] fileHashes, final String message) {
        super("translation_files", type, message);
        this.fileHashes = fileHashes;
    }
}