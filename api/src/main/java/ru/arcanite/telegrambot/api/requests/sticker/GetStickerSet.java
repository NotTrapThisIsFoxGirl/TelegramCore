package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetStickerSetResponse;

public class GetStickerSet extends BaseRequest<GetStickerSet, GetStickerSetResponse> {

    public GetStickerSet(final String name) {
        super(GetStickerSetResponse.class);
        add("name", name);
    }
}