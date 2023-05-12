package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class DeleteChatPhoto extends BaseRequest<DeleteChatPhoto, BaseResponse> {

    public DeleteChatPhoto(final Object chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }
}