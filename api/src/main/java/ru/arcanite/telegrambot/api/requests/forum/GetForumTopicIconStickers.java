package ru.arcanite.telegrambot.api.requests.forum;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetForumTopicIconStickersResponse;

public class GetForumTopicIconStickers extends BaseRequest<GetForumTopicIconStickers, GetForumTopicIconStickersResponse> {

    public GetForumTopicIconStickers() {
        super(GetForumTopicIconStickersResponse.class);
    }
}