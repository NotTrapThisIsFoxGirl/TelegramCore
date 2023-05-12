package ru.arcanite.telegrambot.api.objects.webapp;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
@AllArgsConstructor
public class SentWebAppMessage implements BaseObject {

    @SerializedName("inline_message_id")
    private final String inlineMessageId;

    public SentWebAppMessage() {
        this(null);
    }
}