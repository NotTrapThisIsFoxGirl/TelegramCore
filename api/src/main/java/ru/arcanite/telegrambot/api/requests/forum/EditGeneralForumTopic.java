package ru.arcanite.telegrambot.api.requests.forum;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class EditGeneralForumTopic extends BaseRequest<EditGeneralForumTopic, BaseResponse> {

    public EditGeneralForumTopic(final Long chatId, final String name) {
        this(chatId.toString(), name);
    }

    public EditGeneralForumTopic(final String chatId, final String name) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("name", name);
    }
}