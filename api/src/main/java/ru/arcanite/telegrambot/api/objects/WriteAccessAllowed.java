package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class WriteAccessAllowed implements BaseObject {

    @SerializedName("web_app_name")
    private String webAppName;
}