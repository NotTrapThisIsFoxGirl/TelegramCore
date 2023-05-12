package ru.arcanite.telegrambot.api.objects.forum;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class ForumTopic implements BaseObject {

    @SerializedName("message_thread_id")
    private Integer messageThreadId;
    private String name;
    @SerializedName("icon_color")
    private Integer iconColor;
    @SerializedName("icon_custom_emoji_id")
    private String iconCustomEmojiId;
}