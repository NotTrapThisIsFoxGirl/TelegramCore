package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetChatStickerSet extends BaseRequest<SetChatStickerSet, BaseResponse> {

    public SetChatStickerSet(final Object chatId, final String stickerSetName) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("sticker_set_name", stickerSetName);
    }
}