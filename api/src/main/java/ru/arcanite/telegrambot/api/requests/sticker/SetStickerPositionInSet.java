package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetStickerPositionInSet extends BaseRequest<SetStickerPositionInSet, BaseResponse> {

    public SetStickerPositionInSet(final String sticker, final int position) {
        super(BaseResponse.class);
        add("sticker", sticker);
        add("position", position);
    }
}