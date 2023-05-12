package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class SecureValue implements BaseObject {

    private DataCredentials data;
    @SerializedName("front_side")
    private FileCredentials frontSide;
    @SerializedName("reverse_side")
    private FileCredentials reverseSide;
    private FileCredentials selfie;
    private FileCredentials[] translation;
    private FileCredentials[] files;
}