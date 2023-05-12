package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class DeleteStickerSet extends BaseRequest<DeleteStickerSet, BaseResponse> {

    public DeleteStickerSet(final String name) {
        super(BaseResponse.class);
        add("name", name);
    }
}