package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetCustomEmojiStickerSetThumbnail extends BaseRequest<SetCustomEmojiStickerSetThumbnail, BaseResponse> {

    public SetCustomEmojiStickerSetThumbnail(final String name) {
        super(BaseResponse.class);
        add("name", name);
    }

    public SetCustomEmojiStickerSetThumbnail setCustomEmojiId(final String customEmojiId) {
        add("custom_emoji_id", customEmojiId);
        return this;
    }
}