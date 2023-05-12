package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.requests.chat.ChatAction;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SendChatAction extends BaseRequest<SendChatAction, BaseResponse> {

    public SendChatAction(final Object chatId, final String action) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("action", action);
    }

    public SendChatAction(final Object chatId, final ChatAction action) {
        this(chatId, action.name());
    }

    public SendChatAction setMessageThreadId(final int messageThreadId) {
        add("message_thread_id", messageThreadId);
        return this;
    }
}