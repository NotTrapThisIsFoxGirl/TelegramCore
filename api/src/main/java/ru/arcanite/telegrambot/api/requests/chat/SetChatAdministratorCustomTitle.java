package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetChatAdministratorCustomTitle extends BaseRequest<SetChatAdministratorCustomTitle, BaseResponse> {

    public SetChatAdministratorCustomTitle(final Object chatId, final long userId, final String customTitle) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("user_id", userId);
        add("custom_title", customTitle);
    }
}