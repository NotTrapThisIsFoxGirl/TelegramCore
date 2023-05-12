package ru.arcanite.telegrambot.api.objects.menubuttons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.webapp.WebAppInfo;

@Getter
public class MenuButtonWebApp extends MenuButton {

    private final String text;
    @SerializedName("web_app")
    private final WebAppInfo webApp;

    public MenuButtonWebApp(final String text, final WebAppInfo webAppInfo) {
        super("web_app");
        this.text = text;
        this.webApp = webAppInfo;
    }
}