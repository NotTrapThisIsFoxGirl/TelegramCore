package ru.arcanite.telegrambot.api.requests.forum;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.CreateForumTopicResponse;

public class CreateForumTopic extends BaseRequest<CreateForumTopic, CreateForumTopicResponse> {

    public CreateForumTopic(final Long chatId, final String name) {
        this(chatId.toString(), name);
    }

    public CreateForumTopic(final String chatId, final String name) {
        super(CreateForumTopicResponse.class);
        add("chat_id", chatId);
        add("name", name);
    }

    public CreateForumTopic setIconColor(final int iconColor) {
        add("icon_color", iconColor);
        return this;
    }

    public CreateForumTopic setIconCustomEmojiId(final String iconCustomEmojiId) {
        add("icon_custom_emoji_id", iconCustomEmojiId);
        return this;
    }
}