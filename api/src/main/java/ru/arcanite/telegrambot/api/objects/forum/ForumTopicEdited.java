package ru.arcanite.telegrambot.api.objects.forum;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class ForumTopicEdited implements BaseObject {

    private String name;
    @SerializedName("icon_custom_emoji_id")
    private String iconCustomEmojiId;
}