package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.BaseSendRequest;
import ru.arcanite.telegrambot.api.requests.ParseMode;

public class SendMessage extends BaseSendRequest<SendMessage> {

    public SendMessage(final Object chatId, final String text) {
        super(chatId);
        add("text", text);
    }

    public SendMessage setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendMessage setEntities(final MessageEntity... entities) {
        return add("entities", entities);
    }

    public SendMessage setDisableWebPagePreview(final boolean disableWebPagePreview) {
        return add("disable_web_page_preview", disableWebPagePreview);
    }
}