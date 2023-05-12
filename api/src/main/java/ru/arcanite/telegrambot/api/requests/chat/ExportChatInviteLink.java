package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.StringResponse;

public class ExportChatInviteLink extends BaseRequest<ExportChatInviteLink, StringResponse> {

    public ExportChatInviteLink(final Object chatId) {
        super(StringResponse.class);
        add("chat_id", chatId);
    }
}