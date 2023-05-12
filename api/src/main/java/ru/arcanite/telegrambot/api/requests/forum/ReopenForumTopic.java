package ru.arcanite.telegrambot.api.requests.forum;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class ReopenForumTopic extends BaseRequest<ReopenForumTopic, BaseResponse> {

    public ReopenForumTopic(final Long chatId, final int messageThreadId) {
        this(chatId.toString(), messageThreadId);
    }

    public ReopenForumTopic(final String chatId, final int messageThreadId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("message_thread_id", messageThreadId);
    }
}