package ru.arcanite.telegrambot.api.objects.bot.command.scope;

import com.google.gson.annotations.SerializedName;

public class BotCommandsScopeChatMember extends BotCommandScope {

    @SerializedName("chat_id")
    private final Object chatId;
    @SerializedName("user_id")
    private final Long userId;

    public BotCommandsScopeChatMember(final Object chatId, final long userId) {
        this.type = "chat_member";
        this.chatId = chatId;
        this.userId = userId;
    }
}