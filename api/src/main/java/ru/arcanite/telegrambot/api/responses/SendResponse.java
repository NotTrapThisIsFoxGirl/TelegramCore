package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.message.Message;

@Getter
public class SendResponse extends BaseResponse {

    @SerializedName("result")
    private Message message;
}