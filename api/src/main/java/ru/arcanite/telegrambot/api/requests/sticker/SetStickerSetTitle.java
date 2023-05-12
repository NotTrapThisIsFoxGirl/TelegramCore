package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetStickerSetTitle extends BaseRequest<SetStickerSetTitle, BaseResponse> {

    public SetStickerSetTitle(final String name, final String title) {
        super(BaseResponse.class);
        add("name", name);
        add("title", title);
    }
}