package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.objects.sticker.StickerFormat;
import ru.arcanite.telegrambot.api.requests.BaseUploadRequest;
import ru.arcanite.telegrambot.api.responses.GetFileResponse;

public class UploadStickerFile extends BaseUploadRequest<UploadStickerFile, GetFileResponse> {

    public UploadStickerFile(final long userId, final Object sticker, final StickerFormat stickerFormat) {
        super(GetFileResponse.class, "sticker", sticker);
        add("user_id", userId);
        add("sticker_format", stickerFormat.name());
    }
}