package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class DataCredentials {

    @SerializedName("data_hash")
    private String dataHash;
    private String secret;
}