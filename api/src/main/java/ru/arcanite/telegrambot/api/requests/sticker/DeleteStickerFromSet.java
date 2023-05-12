package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class DeleteStickerFromSet extends BaseRequest<DeleteStickerFromSet, BaseResponse> {

    public DeleteStickerFromSet(final String sticker) {
        super(BaseResponse.class);
        add("sticker", sticker);
    }
}