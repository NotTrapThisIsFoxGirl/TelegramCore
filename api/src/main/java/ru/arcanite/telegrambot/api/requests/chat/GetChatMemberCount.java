package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetChatMemberCountResponse;

public class GetChatMemberCount extends BaseRequest<GetChatMemberCount, GetChatMemberCountResponse> {

    public GetChatMemberCount(final Object chatId) {
        super(GetChatMemberCountResponse.class);
        add("chat_id", chatId);
    }
}