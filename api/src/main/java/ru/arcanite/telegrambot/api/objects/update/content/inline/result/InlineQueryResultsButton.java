package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.webapp.WebAppInfo;

@Getter
public class InlineQueryResultsButton implements BaseObject {

    private final String text;

    @SerializedName("web_app")
    private WebAppInfo webApp;
    @SerializedName("start_parameter")
    private String startParameter;

    public InlineQueryResultsButton(final String text, final WebAppInfo webApp) {
        this.text = text;
        this.webApp = webApp;
    }

    public InlineQueryResultsButton(final String text, final String startParameter) {
        this.text = text;
        this.startParameter = startParameter;
    }
}