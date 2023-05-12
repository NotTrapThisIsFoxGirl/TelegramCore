package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseUploadRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetStickerSetThumbnail extends BaseUploadRequest<AddStickerToSet, BaseResponse> {

    public SetStickerSetThumbnail(final String name, final long userId, final Object thumbnail) {
        super(BaseResponse.class, "thumbnail", thumbnail);
        add("name", name);
        add("user_id", userId);
    }

    public SetStickerSetThumbnail(final String name, final long userId) {
        super(BaseResponse.class, "name", name);
        add("user_id", userId);
    }
}