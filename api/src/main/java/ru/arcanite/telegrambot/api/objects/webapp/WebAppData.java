package ru.arcanite.telegrambot.api.objects.webapp;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class WebAppData implements BaseObject {

    private String data;
    @SerializedName("button_text")
    private String buttonText;
}