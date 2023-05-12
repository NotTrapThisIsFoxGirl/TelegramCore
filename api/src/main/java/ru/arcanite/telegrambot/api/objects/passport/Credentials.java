package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Credentials {

    @SerializedName("secure_data")
    private SecureData secureData;
    private String nonce;
}