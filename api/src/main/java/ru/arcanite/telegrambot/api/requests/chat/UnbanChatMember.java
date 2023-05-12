package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class UnbanChatMember extends BaseRequest<UnbanChatMember, BaseResponse> {

    public UnbanChatMember(final Object chatId, final long userId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("user_id", userId);
    }

    public UnbanChatMember setOnlyIfBanned(final boolean onlyIfBanned) {
        return add("only_if_banned", onlyIfBanned);
    }
}