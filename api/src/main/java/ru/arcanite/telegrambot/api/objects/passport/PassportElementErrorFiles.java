package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PassportElementErrorFiles extends PassportElementError {

    @SerializedName("file_hashes")
    private final String[] fileHashes;

    public PassportElementErrorFiles(final String type, final String[] fileHashes, final String message) {
        super("files", type, message);
        this.fileHashes = fileHashes;
    }
}