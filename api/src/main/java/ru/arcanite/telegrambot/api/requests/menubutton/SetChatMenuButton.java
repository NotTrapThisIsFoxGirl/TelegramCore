package ru.arcanite.telegrambot.api.requests.menubutton;

import ru.arcanite.telegrambot.api.objects.menubuttons.MenuButton;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetChatMenuButton extends BaseRequest<SetChatMenuButton, BaseResponse> {

    public SetChatMenuButton() {
        super(BaseResponse.class);
    }

    public SetChatMenuButton setChatId(final long chatId) {
        return add("chat_id", chatId);
    }

    public SetChatMenuButton setMenuButton(final MenuButton menuButton) {
        return add("menu_button", menuButton);
    }
}