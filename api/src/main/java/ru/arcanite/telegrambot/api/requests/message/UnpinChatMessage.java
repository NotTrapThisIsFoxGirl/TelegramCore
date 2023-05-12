package ru.arcanite.telegrambot.api.requests.message;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class UnpinChatMessage extends BaseRequest<UnpinChatMessage, BaseResponse> {

    public UnpinChatMessage(final Object chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }

    public UnpinChatMessage setMessageId(final int messageId) {
        return add("message_id", messageId);
    }
}