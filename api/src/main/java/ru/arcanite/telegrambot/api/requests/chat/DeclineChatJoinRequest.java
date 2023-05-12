package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class DeclineChatJoinRequest extends BaseRequest<DeclineChatJoinRequest, BaseResponse> {

    public DeclineChatJoinRequest(final Object chatId, final long userId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("user_id", userId);
    }
}