package ru.arcanite.telegrambot.api.objects.keyboard.buttons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.LoginUrl;
import ru.arcanite.telegrambot.api.objects.game.CallbackGame;
import ru.arcanite.telegrambot.api.objects.update.content.inline.SwitchInlineQueryChosenChat;
import ru.arcanite.telegrambot.api.objects.webapp.WebAppInfo;

@Getter
public class InlineKeyboardButton implements BaseObject {

    private final String text;

    private String url;
    @SerializedName("login_url")
    private LoginUrl loginUrl;
    @SerializedName("callback_data")
    private String callbackData;
    @SerializedName("switch_inline_query")
    private String switchInlineQuery;
    @SerializedName("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;
    @SerializedName("switch_inline_query_chosen_chat")
    private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;
    @SerializedName("callback_game")
    private CallbackGame callbackGame;
    private boolean pay;
    @SerializedName("web_app")
    private WebAppInfo webApp;

    public InlineKeyboardButton(final String text) {
        this.text = text;
    }

    public InlineKeyboardButton setUrl(final String url) {
        this.url = url;
        return this;
    }

    public InlineKeyboardButton setLoginUrl(final LoginUrl loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    public InlineKeyboardButton setCallbackData(final String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public InlineKeyboardButton setSwitchInlineQuery(final String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
        return this;
    }

    public InlineKeyboardButton setSwitchInlineQueryCurrentChat(final String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        return this;
    }

    public InlineKeyboardButton setSwitchInlineQueryChosenChat(final SwitchInlineQueryChosenChat switchInlineQueryChosenChat) {
        this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
        return this;
    }

    public InlineKeyboardButton newCallbackGame() {
        this.callbackGame = new CallbackGame();
        return this;
    }

    public InlineKeyboardButton setPay() {
        this.pay = true;
        return this;
    }

    public InlineKeyboardButton setWebApp(final WebAppInfo webApp) {
        this.webApp = webApp;
        return this;
    }
}