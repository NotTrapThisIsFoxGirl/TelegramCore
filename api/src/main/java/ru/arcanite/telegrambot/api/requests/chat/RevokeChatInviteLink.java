package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.ChatInviteLinkResponse;

public class RevokeChatInviteLink extends BaseRequest<RevokeChatInviteLink, ChatInviteLinkResponse> {

    public RevokeChatInviteLink(final Object chatId, final String inviteLink) {
        super(ChatInviteLinkResponse.class);
        add("chat_id", chatId);
        add("invite_link", inviteLink);
    }
}