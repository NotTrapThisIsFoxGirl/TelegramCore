package ru.arcanite.telegrambot.api.requests.message;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class PinChatMessage extends BaseRequest<PinChatMessage, BaseResponse> {

    public PinChatMessage(final Object chatId, final int messageId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("message_id", messageId);
    }

    public PinChatMessage setDisableNotification(final boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }
}