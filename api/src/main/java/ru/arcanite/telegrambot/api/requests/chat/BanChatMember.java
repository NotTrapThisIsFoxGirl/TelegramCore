package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class BanChatMember extends BaseRequest<BanChatMember, BaseResponse> {

    public BanChatMember(final Object chatId, final long userId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("user_id", userId);
    }

    public BanChatMember setUntilDate(final int untilDate) {
        return add("until_date", untilDate);
    }

    public BanChatMember setRevokeMessages(final boolean revokeMessages) {
        return add("revoke_messages", revokeMessages);
    }
}