package ru.arcanite.telegrambot.api.objects.chat;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class ChatShared implements BaseObject {

    @SerializedName("request_id")
    private Integer requestId;
    @SerializedName("chat_id")
    private Long chatId;
}