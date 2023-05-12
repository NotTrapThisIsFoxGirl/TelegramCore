package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.objects.sticker.MaskPosition;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetStickerMaskPosition extends BaseRequest<SetStickerMaskPosition, BaseResponse> {

    public SetStickerMaskPosition(final String sticker) {
        super(BaseResponse.class);
        add("sticker", sticker);
    }

    public SetStickerMaskPosition setMaskPosition(final MaskPosition maskPosition) {
        add("mask_position", maskPosition);
        return this;
    }
}