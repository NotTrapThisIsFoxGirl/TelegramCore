package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public abstract class PassportElementErrorAbstractFile extends PassportElementError {

    @SerializedName("file_hash")
    private final String fileHash;

    public PassportElementErrorAbstractFile(final String source, final String type, final String fileHash, final String message) {
        super(source, type, message);
        this.fileHash = fileHash;
    }
}