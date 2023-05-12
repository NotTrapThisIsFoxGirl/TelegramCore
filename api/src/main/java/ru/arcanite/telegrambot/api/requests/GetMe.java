package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.responses.GetMeResponse;

public class GetMe extends BaseRequest<GetMe, GetMeResponse> {

    public GetMe() {
        super(GetMeResponse.class);
    }
}