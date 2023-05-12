package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class PassportElementErrorDataField extends PassportElementError {

    @SerializedName("field_name")
    private final String fieldName;
    @SerializedName("data_hash")
    private final String dataHash;

    public PassportElementErrorDataField(final String type, final String fieldName, final String dataHash, final String message) {
        super("data", type, message);
        this.fieldName = fieldName;
        this.dataHash = dataHash;
    }
}