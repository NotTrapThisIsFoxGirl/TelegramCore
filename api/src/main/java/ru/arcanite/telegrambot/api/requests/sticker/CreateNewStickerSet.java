package ru.arcanite.telegrambot.api.requests.sticker;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.sticker.InputSticker;
import ru.arcanite.telegrambot.api.objects.sticker.StickerFormat;
import ru.arcanite.telegrambot.api.objects.sticker.StickerType;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

@Getter
public class CreateNewStickerSet extends BaseRequest<CreateNewStickerSet, BaseResponse> {

    private final boolean multipart = true;

    public CreateNewStickerSet(final long userId, final String name, final String title, final InputSticker[] stickers, final StickerFormat stickerFormat) {
        super(BaseResponse.class);
        add("user_id", userId);
        add("name", name);
        add("title", title);
        add("stickers", stickers);
        add("sticker_format", stickerFormat.name());
        for (final InputSticker sticker : stickers) {
            if (sticker.getAttachment() != null) {
                add(sticker.getAttachName(), sticker.getAttachment());
            }
        }
    }

    public CreateNewStickerSet setStickerType(final StickerType stickerType) {
        return add("sticker_type", stickerType.name());
    }

    public CreateNewStickerSet setNeedsRepainting(final boolean needsRepainting) {
        return add("needs_repainting", needsRepainting);
    }
}