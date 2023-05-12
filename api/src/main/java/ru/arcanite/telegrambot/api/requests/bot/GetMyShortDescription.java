package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetMyShortDescriptionResponse;

public class GetMyShortDescription extends BaseRequest<GetMyShortDescription, GetMyShortDescriptionResponse> {

    public GetMyShortDescription() {
        super(GetMyShortDescriptionResponse.class);
    }

    public GetMyShortDescription setLanguageCode(final String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}