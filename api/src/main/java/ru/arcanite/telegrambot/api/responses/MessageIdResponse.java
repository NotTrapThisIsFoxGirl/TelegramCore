package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.message.MessageId;

@Getter
public class MessageIdResponse extends BaseResponse {

    @SerializedName("result")
    private MessageId messageId;
}