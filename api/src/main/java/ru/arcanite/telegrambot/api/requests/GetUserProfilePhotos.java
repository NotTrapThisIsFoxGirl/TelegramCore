package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.responses.GetUserProfilePhotosResponse;

public class GetUserProfilePhotos extends BaseRequest<GetUserProfilePhotos, GetUserProfilePhotosResponse> {

    public GetUserProfilePhotos(final long userId) {
        super(GetUserProfilePhotosResponse.class);
        add("user_id", userId);
    }

    public GetUserProfilePhotos setOffset(final int offset) {
        return add("offset", offset);
    }

    public GetUserProfilePhotos setLimit(final int limit) {
        return add("limit", limit);
    }
}