package ru.arcanite.telegrambot.api.objects.bot;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class BotShortDescription implements BaseObject {

    @SerializedName("short_description")
    private String shortDescription;
}