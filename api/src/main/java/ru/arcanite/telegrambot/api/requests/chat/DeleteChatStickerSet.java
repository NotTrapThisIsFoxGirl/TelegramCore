package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class DeleteChatStickerSet extends BaseRequest<DeleteChatStickerSet, BaseResponse> {

    public DeleteChatStickerSet(final Object chatId) {
        super(BaseResponse.class);
        add("chat_id", chatId);
    }
}
