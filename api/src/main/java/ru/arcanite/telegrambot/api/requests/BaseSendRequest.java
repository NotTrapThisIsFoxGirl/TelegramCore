package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.objects.keyboard.Keyboard;
import ru.arcanite.telegrambot.api.responses.SendResponse;

public abstract class BaseSendRequest<T extends BaseSendRequest<T>> extends BaseRequest<T, SendResponse> {

    public BaseSendRequest(final Object chatId) {
        super(SendResponse.class);
        add("chat_id", chatId);
    }

    public T setMessageThreadId(final int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    public T setDisableNotification(final boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public T setReplyToMessageId(final int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }

    public T setAllowSendingWithoutReply(final boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }

    public T setReplyMarkup(final Keyboard replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public T setProtectContent(final boolean protectContent) {
        return add("protect_content", protectContent);
    }
}