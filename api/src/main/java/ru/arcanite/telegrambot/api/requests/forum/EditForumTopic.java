package ru.arcanite.telegrambot.api.requests.forum;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class EditForumTopic extends BaseRequest<EditForumTopic, BaseResponse> {

    public EditForumTopic(final Long chatId, final int messageThreadId) {
        this(chatId.toString(), messageThreadId);
    }

    public EditForumTopic(final String chatId, final int messageThreadId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("message_thread_id", messageThreadId);
    }

    public EditForumTopic(final Long chatId, final int messageThreadId, final String name, final String iconCustomEmojiId) {
        this(chatId.toString(), messageThreadId, name, iconCustomEmojiId);
    }

    public EditForumTopic(final String chatId, final int messageThreadId, final String name, final String iconCustomEmojiId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("message_thread_id", messageThreadId);
        add("name", name);
        add("icon_custom_emoji_id", iconCustomEmojiId);
    }

    public EditForumTopic setName(final String name) {
        add("name", name);
        return this;
    }

    public EditForumTopic setIconCustomEmojiId(final String iconCustomEmojiId) {
        add("icon_custom_emoji_id", iconCustomEmojiId);
        return this;
    }
}