package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class ApproveChatJoinRequest extends BaseRequest<ApproveChatJoinRequest, BaseResponse> {

    public ApproveChatJoinRequest(final Object chatId, final long userId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("user_id", userId);
    }
}