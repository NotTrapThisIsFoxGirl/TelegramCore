package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseUploadRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetStickerSetThumb extends BaseUploadRequest<AddStickerToSet, BaseResponse> {

    public SetStickerSetThumb(final String name, final long userId) {
        super(BaseResponse.class, "name", name);
        add("user_id", userId);
    }
}
