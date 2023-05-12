package ru.arcanite.telegrambot.api.requests.forum;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class HideGeneralForumTopic extends BaseRequest<HideGeneralForumTopic, BaseResponse> {

    public HideGeneralForumTopic(final Long chatId) {
        this(chatId.toString());
    }

    public HideGeneralForumTopic(final String chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }
}