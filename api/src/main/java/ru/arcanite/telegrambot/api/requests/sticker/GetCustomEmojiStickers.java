package ru.arcanite.telegrambot.api.requests.sticker;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetCustomEmojiStickersResponse;

public class GetCustomEmojiStickers extends BaseRequest<GetCustomEmojiStickers, GetCustomEmojiStickersResponse> {

    public GetCustomEmojiStickers(final String... customEmojiIds) {
        super(GetCustomEmojiStickersResponse.class);
        add("custom_emoji_ids", customEmojiIds);
    }
}