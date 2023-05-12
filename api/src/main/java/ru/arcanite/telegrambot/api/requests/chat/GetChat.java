package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetChatResponse;

public class GetChat extends BaseRequest<GetChat, GetChatResponse> {

    public GetChat(final Object chatId) {
        super(GetChatResponse.class);
        add("chat_id", chatId);
    }
}