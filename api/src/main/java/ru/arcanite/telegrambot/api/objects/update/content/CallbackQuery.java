package ru.arcanite.telegrambot.api.objects.update.content;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.update.content.message.Message;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class CallbackQuery implements BaseObject {

    private String id;
    private User from;
    private Message message;
    @SerializedName("inline_message_id")
    private String inlineMessageId;
    @SerializedName("chat_instance")
    private String chatInstance;
    private String data;
    @SerializedName("game_short_name")
    private String gameShortName;
}