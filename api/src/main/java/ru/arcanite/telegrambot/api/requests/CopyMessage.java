package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.responses.MessageIdResponse;

public class CopyMessage extends BaseRequest<CopyMessage, MessageIdResponse> {

    public CopyMessage(final Object chatId, final Object fromChatId, final int messageId) {
        super(MessageIdResponse.class);
        add("chat_id", chatId);
        add("from_chat_id", fromChatId);
        add("message_id", messageId);
    }

    public CopyMessage setMessageThreadId(final Integer messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    public CopyMessage setCaption(final String caption) {
        return add("caption", caption);
    }

    public CopyMessage setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public CopyMessage setCaptionEntities(final MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public CopyMessage setDisableNotification(final boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public CopyMessage setAllowSendingWithoutReply(final boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }

    public CopyMessage setReplyToMessageId(final int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }

    public CopyMessage setReplyMarkup(final int replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}