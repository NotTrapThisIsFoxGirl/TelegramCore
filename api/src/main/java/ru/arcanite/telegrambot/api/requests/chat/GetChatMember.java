package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetChatMemberResponse;

public class GetChatMember extends BaseRequest<GetChatMember, GetChatMemberResponse> {

    public GetChatMember(final Object chatId, final long userId) {
        super(GetChatMemberResponse.class);
        add("chat_id", chatId);
        add("user_id", userId);
    }
}