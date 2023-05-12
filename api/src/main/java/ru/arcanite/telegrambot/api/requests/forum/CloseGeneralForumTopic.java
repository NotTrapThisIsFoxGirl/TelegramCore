package ru.arcanite.telegrambot.api.requests.forum;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class CloseGeneralForumTopic extends BaseRequest<CloseGeneralForumTopic, BaseResponse> {

    public CloseGeneralForumTopic(final Long chatId) {
        this(chatId.toString());
    }

    public CloseGeneralForumTopic(final String chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }
}