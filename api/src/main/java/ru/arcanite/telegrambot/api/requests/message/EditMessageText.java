package ru.arcanite.telegrambot.api.requests.message;

import ru.arcanite.telegrambot.api.objects.keyboard.markup.InlineKeyboardMarkup;
import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.requests.ParseMode;
import ru.arcanite.telegrambot.api.responses.BaseResponse;
import ru.arcanite.telegrambot.api.responses.SendResponse;

public class EditMessageText extends BaseRequest<EditMessageText, BaseResponse> {

    public EditMessageText(final Object chatId, final int messageId, final String text) {
        super(SendResponse.class);
        add("chat_id", chatId);
        add("message_id", messageId);
        add("text", text);
    }

    public EditMessageText(final String inlineMessageId, final String text) {
        super(BaseResponse.class);
        add("inline_message_id", inlineMessageId);
        add("text", text);
    }

    public EditMessageText setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public EditMessageText setEntities(final MessageEntity... entities) {
        return add("entities", entities);
    }

    public EditMessageText setDisableWebPagePreview(final boolean disableWebPagePreview) {
        return add("disable_web_page_preview", disableWebPagePreview);
    }

    public EditMessageText setReplyMarkup(final InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}