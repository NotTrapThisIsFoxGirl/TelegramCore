package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetStickerEmojiList extends BaseRequest<SetStickerEmojiList, BaseResponse> {

    public SetStickerEmojiList(final String sticker, final String[] emojiList) {
        super(BaseResponse.class);
        add("sticker", sticker);
        add("emoji_list", emojiList);
    }
}