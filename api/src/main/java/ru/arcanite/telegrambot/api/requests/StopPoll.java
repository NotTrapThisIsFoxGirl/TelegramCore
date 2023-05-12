package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.objects.keyboard.Keyboard;
import ru.arcanite.telegrambot.api.responses.PollResponse;

public class StopPoll extends BaseRequest<StopPoll, PollResponse> {

    public StopPoll(final Object chatId, final int messageId) {
        super(PollResponse.class);
        add("chat_id", chatId);
        add("message_id", messageId);
    }

    public StopPoll setReplyMarkup(final Keyboard replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}