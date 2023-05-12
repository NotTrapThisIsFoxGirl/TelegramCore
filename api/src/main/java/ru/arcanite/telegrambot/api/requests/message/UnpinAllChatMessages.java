package ru.arcanite.telegrambot.api.requests.message;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class UnpinAllChatMessages extends BaseRequest<UnpinAllChatMessages, BaseResponse> {

    public UnpinAllChatMessages(final Object chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }
}