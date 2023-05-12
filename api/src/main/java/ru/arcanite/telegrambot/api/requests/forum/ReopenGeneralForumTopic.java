package ru.arcanite.telegrambot.api.requests.forum;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class ReopenGeneralForumTopic extends BaseRequest<ReopenGeneralForumTopic, BaseResponse> {

    public ReopenGeneralForumTopic(final Long chatId) {
        this(chatId.toString());
    }

    public ReopenGeneralForumTopic(final String chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }
}