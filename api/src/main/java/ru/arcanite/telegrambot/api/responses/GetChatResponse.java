package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.chat.Chat;

@Getter
public class GetChatResponse extends BaseResponse {

    @SerializedName("result")
    private Chat chat;
}