package ru.arcanite.telegrambot.api.objects.bot.command.scope;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class BotCommandsScopeChat extends BotCommandScope {

    @SerializedName("chat_id")
    private final Object chatId;

    public BotCommandsScopeChat(final Object chatId) {
        this.type = "chat";
        this.chatId = chatId;
    }
}