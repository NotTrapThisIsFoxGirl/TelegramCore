package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetMyDescriptionResponse;

public class GetMyDescription extends BaseRequest<GetMyDescription, GetMyDescriptionResponse> {

    public GetMyDescription() {
        super(GetMyDescriptionResponse.class);
    }

    public GetMyDescription setLanguageCode(final String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}