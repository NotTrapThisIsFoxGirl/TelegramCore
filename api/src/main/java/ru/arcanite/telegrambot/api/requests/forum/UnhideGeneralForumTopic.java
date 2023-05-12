package ru.arcanite.telegrambot.api.requests.forum;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class UnhideGeneralForumTopic extends BaseRequest<UnhideGeneralForumTopic, BaseResponse> {

    public UnhideGeneralForumTopic(final Long chatId) {
        this(chatId.toString());
    }

    public UnhideGeneralForumTopic(final String chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }
}