package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.objects.keyboard.markup.InlineKeyboardMarkup;
import ru.arcanite.telegrambot.api.responses.BaseResponse;
import ru.arcanite.telegrambot.api.responses.SendResponse;

public class StopMessageLiveLocation extends BaseRequest<StopMessageLiveLocation, BaseResponse> {

    public StopMessageLiveLocation(final Object chatId, final int messageId) {
        super(SendResponse.class);
        add("chat_id", chatId);
        add("message_id", messageId);
    }

    public StopMessageLiveLocation(final String inlineMessageId) {
        super(BaseResponse.class);
        add("inline_message_id", inlineMessageId);
    }

    public StopMessageLiveLocation setReplyMarkup(final InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}