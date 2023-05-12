package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.responses.SendResponse;

public class ForwardMessage extends BaseRequest<ForwardMessage, SendResponse> {

    public ForwardMessage(final Object chatId, final Object fromChatId, final int messageId) {
        super(SendResponse.class);
        add("chat_id", chatId);
        add("from_chat_id", fromChatId);
        add("message_id", messageId);
    }

    public ForwardMessage setMessageThreadId(final int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    public ForwardMessage setDisableNotification(final boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }
}