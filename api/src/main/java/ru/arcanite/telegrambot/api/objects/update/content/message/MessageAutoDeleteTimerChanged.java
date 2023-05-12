package ru.arcanite.telegrambot.api.objects.update.content.message;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class MessageAutoDeleteTimerChanged implements BaseObject {

    @SerializedName("message_auto_delete_time")
    private Integer messageAutoDeleteTime;
}