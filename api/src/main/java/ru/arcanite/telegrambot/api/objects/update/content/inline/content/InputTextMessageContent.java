package ru.arcanite.telegrambot.api.objects.update.content.inline.content;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InputTextMessageContent extends InputMessageContent {

    @SerializedName("message_text")
    private final String messageText;

    @SerializedName("parse_mode")
    private String parseMode;
    @SerializedName("disable_web_page_preview")
    private boolean disableWebPagePreview;
    private MessageEntity[] entities;

    public InputTextMessageContent(final String messageText) {
        this.messageText = messageText;
    }

    public InputTextMessageContent setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }

    public InputTextMessageContent setEntities(final MessageEntity... entities) {
        this.entities = entities;
        return this;
    }

    public InputTextMessageContent setDisableWebPagePreview(final boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
        return this;
    }
}