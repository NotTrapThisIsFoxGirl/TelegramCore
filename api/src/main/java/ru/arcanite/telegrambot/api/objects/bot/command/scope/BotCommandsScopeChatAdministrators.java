package ru.arcanite.telegrambot.api.objects.bot.command.scope;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class BotCommandsScopeChatAdministrators extends BotCommandScope {

    @SerializedName("chat_id")
    private final Object chatId;

    public BotCommandsScopeChatAdministrators(final Object chatId) {
        this.type = "chat_administrators";
        this.chatId = chatId;
    }
}