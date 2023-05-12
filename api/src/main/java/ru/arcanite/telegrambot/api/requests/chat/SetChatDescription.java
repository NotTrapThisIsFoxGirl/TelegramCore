package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetChatDescription extends BaseRequest<SetChatDescription, BaseResponse> {

    public SetChatDescription(final Object chatId, final String description) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("description", description);
    }
}