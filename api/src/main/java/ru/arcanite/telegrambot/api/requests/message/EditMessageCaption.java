package ru.arcanite.telegrambot.api.requests.message;

import ru.arcanite.telegrambot.api.objects.keyboard.markup.InlineKeyboardMarkup;
import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.requests.ParseMode;
import ru.arcanite.telegrambot.api.responses.BaseResponse;
import ru.arcanite.telegrambot.api.responses.SendResponse;

public class EditMessageCaption extends BaseRequest<EditMessageCaption, BaseResponse> {

    public EditMessageCaption(final Object chatId, final int messageId) {
        super(SendResponse.class);
        add("chat_id", chatId);
        add("message_id", messageId);
    }

    public EditMessageCaption(final String inlineMessageId) {
        super(BaseResponse.class);
        add("inline_message_id", inlineMessageId);
    }

    public EditMessageCaption setCaption(final String caption) {
        return add("caption", caption);
    }

    public EditMessageCaption setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public EditMessageCaption setCaptionEntities(final MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public EditMessageCaption setReplyMarkup(final InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}