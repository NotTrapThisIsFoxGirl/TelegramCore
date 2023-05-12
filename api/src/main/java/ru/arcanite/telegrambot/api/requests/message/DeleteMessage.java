package ru.arcanite.telegrambot.api.requests.message;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class DeleteMessage extends BaseRequest<DeleteMessage, BaseResponse> {

    public DeleteMessage(final Object chatId, final int messageId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("message_id", messageId);
    }
}