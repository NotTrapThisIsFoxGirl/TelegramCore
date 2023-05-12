package ru.arcanite.telegrambot.api.objects.keyboard.buttons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class KeyboardButtonRequestUser implements BaseObject {

    @SerializedName("request_id")
    private final Integer requestId;

    @SerializedName("user_is_bot")
    private boolean userIsBot;
    @SerializedName("user_is_premium")
    private boolean userIsPremium;

    public KeyboardButtonRequestUser(final int requestId) {
        this.requestId = requestId;
    }

    public KeyboardButtonRequestUser setUserIsBot(final boolean userIsBot) {
        this.userIsBot = userIsBot;
        return this;
    }

    public KeyboardButtonRequestUser setUserIsPremium(final boolean userIsPremium) {
        this.userIsPremium = userIsPremium;
        return this;
    }
}