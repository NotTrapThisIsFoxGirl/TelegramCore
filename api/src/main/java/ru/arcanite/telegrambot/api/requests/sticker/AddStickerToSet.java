package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.objects.sticker.InputSticker;
import ru.arcanite.telegrambot.api.objects.sticker.MaskPosition;
import ru.arcanite.telegrambot.api.requests.BaseUploadRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class AddStickerToSet extends BaseUploadRequest<AddStickerToSet, BaseResponse> {

    public AddStickerToSet(final long userId, final String name, final InputSticker sticker) {
        super(BaseResponse.class, getAttachName(sticker), getAttachment(sticker));
        add("user_id", userId);
        add("name", name);
        add("sticker", sticker);
    }

    private static String getAttachName(final InputSticker sticker) {
        return sticker.getAttachment() != null ? sticker.getAttachName() : "sticker_id";
    }

    private static Object getAttachment(final InputSticker sticker) {
        return sticker.getAttachment() != null ? sticker.getAttachment() : "sticker_id";
    }

    public AddStickerToSet setMaskPosition(final MaskPosition maskPosition) {
        return add("mask_position", maskPosition);
    }
}