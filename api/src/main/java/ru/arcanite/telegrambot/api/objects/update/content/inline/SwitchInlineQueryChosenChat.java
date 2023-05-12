package ru.arcanite.telegrambot.api.objects.update.content.inline;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class SwitchInlineQueryChosenChat implements BaseObject {

    private String query;
    @SerializedName("allow_user_chats")
    private boolean allowUserChats;
    @SerializedName("allow_bot_chats")
    private boolean allowBotChats;
    @SerializedName("allow_group_chats")
    private boolean allowGroupChats;
    @SerializedName("allow_channel_chats")
    private boolean allowChannelChats;

    public SwitchInlineQueryChosenChat setQuery(final String query) {
        this.query = query;
        return this;
    }

    public SwitchInlineQueryChosenChat setAllowUserChats(final boolean allowUserChats) {
        this.allowUserChats = allowUserChats;
        return this;
    }

    public SwitchInlineQueryChosenChat setAllowBotChats(final boolean allowBotChats) {
        this.allowBotChats = allowBotChats;
        return this;
    }

    public SwitchInlineQueryChosenChat setAllowGroupChats(final boolean allowGroupChats) {
        this.allowGroupChats = allowGroupChats;
        return this;
    }

    public SwitchInlineQueryChosenChat setAllowChannelChats(final boolean allowChannelChats) {
        this.allowChannelChats = allowChannelChats;
        return this;
    }
}