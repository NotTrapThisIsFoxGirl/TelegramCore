package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PassportElementErrorUnspecified extends PassportElementError {

    @SerializedName("element_hash")
    private final String elementHash;

    public PassportElementErrorUnspecified(final String type, final String elementHash, final String message) {
        super("unspecified", type, message);
        this.elementHash = elementHash;
    }
}