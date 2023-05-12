package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class LoginUrl implements BaseObject {

    private final String url;
    @SerializedName("forward_text")
    private String forwardText;
    @SerializedName("bot_username")
    private String botUsername;
    @SerializedName("request_write_access")
    private boolean requestWriteAccess;

    public LoginUrl(final String url) {
        this.url = url;
    }

    public LoginUrl setForwardText(final String forwardText) {
        this.forwardText = forwardText;
        return this;
    }

    public LoginUrl setBotUsername(final String botUsername) {
        this.botUsername = botUsername;
        return this;
    }

    public LoginUrl setRequestWriteAccess(final boolean requestWriteAccess) {
        this.requestWriteAccess = requestWriteAccess;
        return this;
    }
}