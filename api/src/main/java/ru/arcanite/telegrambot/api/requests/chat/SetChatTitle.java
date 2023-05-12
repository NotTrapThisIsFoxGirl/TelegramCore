package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetChatTitle extends BaseRequest<SetChatTitle, BaseResponse> {

    public SetChatTitle(final Object chatId, final String title) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("title", title);
    }
}