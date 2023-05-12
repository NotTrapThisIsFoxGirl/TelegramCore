package ru.arcanite.telegrambot.api.objects.keyboard.buttons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.webapp.WebAppInfo;

@Getter
public class KeyboardButton implements BaseObject {

    private final String text;

    @SerializedName("request_contact")
    private boolean requestContact;
    @SerializedName("request_location")
    private boolean requestLocation;
    @SerializedName("request_poll")
    private KeyboardButtonPollType requestPoll;
    @SerializedName("request_user")
    private KeyboardButtonRequestUser requestUser;
    @SerializedName("request_chat")
    private KeyboardButtonRequestChat requestChat;
    @SerializedName("web_app")
    private WebAppInfo webApp;

    public KeyboardButton(final String text) {
        this.text = text;
    }

    public KeyboardButton setRequestLocation(final boolean requestLocation) {
        this.requestLocation = requestLocation;
        return this;
    }

    public KeyboardButton setRequestContact(final boolean requestContact) {
        this.requestContact = requestContact;
        return this;
    }

    public KeyboardButton setRequestPoll(final KeyboardButtonPollType poll) {
        this.requestPoll = poll;
        return this;
    }

    public KeyboardButton setRequestUser(final KeyboardButtonRequestUser user) {
        this.requestUser = user;
        return this;
    }

    public KeyboardButton setRequestChat(final KeyboardButtonRequestChat chat) {
        this.requestChat = chat;
        return this;
    }

    public KeyboardButton setWebAppInfo(final WebAppInfo webApp) {
        this.webApp = webApp;
        return this;
    }
}