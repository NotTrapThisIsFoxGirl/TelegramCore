package ru.arcanite.telegrambot.api.requests.menubutton;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetChatMenuButtonResponse;

public class GetChatMenuButton extends BaseRequest<GetChatMenuButton, GetChatMenuButtonResponse> {

    public GetChatMenuButton() {
        super(GetChatMenuButtonResponse.class);
    }

    public GetChatMenuButton setChatId(final long chatId) {
        return add("chat_id", chatId);
    }
}