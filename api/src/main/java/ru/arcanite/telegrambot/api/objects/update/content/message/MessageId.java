package ru.arcanite.telegrambot.api.objects.update.content.message;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class MessageId implements BaseObject {

    @SerializedName("message_id")
    private Integer messageId;
}