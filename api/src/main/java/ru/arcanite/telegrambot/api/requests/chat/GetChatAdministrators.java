package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetChatAdministratorsResponse;

public class GetChatAdministrators extends BaseRequest<GetChatAdministrators, GetChatAdministratorsResponse> {

    public GetChatAdministrators(final Object chatId) {
        super(GetChatAdministratorsResponse.class);
        add("chat_id", chatId);
    }
}