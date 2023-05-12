package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.message.Message;

@Getter
public class MessagesResponse extends BaseResponse {

    @SerializedName("result")
    private Message[] messages;
}