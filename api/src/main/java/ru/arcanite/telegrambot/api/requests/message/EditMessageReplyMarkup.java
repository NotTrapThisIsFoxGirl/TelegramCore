package ru.arcanite.telegrambot.api.requests.message;

import ru.arcanite.telegrambot.api.objects.keyboard.markup.InlineKeyboardMarkup;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;
import ru.arcanite.telegrambot.api.responses.SendResponse;

public class EditMessageReplyMarkup extends BaseRequest<EditMessageReplyMarkup, BaseResponse> {

    public EditMessageReplyMarkup(final Object chatId, final int messageId) {
        super(SendResponse.class);
        add("chat_id", chatId);
        add("message_id", messageId);
    }

    public EditMessageReplyMarkup(final String inlineMessageId) {
        super(BaseResponse.class);
        add("inline_message_id", inlineMessageId);
    }

    public EditMessageReplyMarkup setReplyMarkup(final InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}