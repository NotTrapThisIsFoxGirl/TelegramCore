package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetMyNameResponse;

public class GetMyName extends BaseRequest<GetMyName, GetMyNameResponse> {

    public GetMyName() {
        super(GetMyNameResponse.class);
    }

    public GetMyName setLanguageCode(final String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}