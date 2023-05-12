package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class BanChatSenderChat extends BaseRequest<BanChatSenderChat, BaseResponse> {

    public BanChatSenderChat(final Object chatId, final long senderChatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("sender_chat_id", senderChatId);
    }
}