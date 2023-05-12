package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetStickerKeywords extends BaseRequest<SetStickerKeywords, BaseResponse> {

    public SetStickerKeywords(final String sticker) {
        super(BaseResponse.class);
        add("sticker", sticker);
    }

    public SetStickerKeywords setKeywords(final String[] keywords) {
        add("keywords", keywords);
        return this;
    }
}