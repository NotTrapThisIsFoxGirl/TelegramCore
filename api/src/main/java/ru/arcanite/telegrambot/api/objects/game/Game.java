package ru.arcanite.telegrambot.api.objects.game;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.PhotoSize;
import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;

@Getter
public class Game implements BaseObject {

    private String title;
    private String description;
    private PhotoSize[] photo;
    private String text;
    @SerializedName("text_entities")
    private MessageEntity[] textEntities;
    private Animation animation;
}