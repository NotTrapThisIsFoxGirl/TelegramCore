package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.ChatInviteLinkResponse;

public class CreateChatInviteLink extends BaseRequest<CreateChatInviteLink, ChatInviteLinkResponse> {

    public CreateChatInviteLink(final Object chatId) {
        super(ChatInviteLinkResponse.class);
        add("chat_id", chatId);
    }

    public CreateChatInviteLink setName(final String name) {
        return add("name", name);
    }

    public CreateChatInviteLink setExpireDate(final int expireDate) {
        return add("expire_date", expireDate);
    }

    public CreateChatInviteLink setMemberLimit(final int memberLimit) {
        return add("member_limit", memberLimit);
    }

    public CreateChatInviteLink setCreatesJoinRequest(final boolean createsJoinRequest) {
        return add("creates_join_request", createsJoinRequest);
    }
}