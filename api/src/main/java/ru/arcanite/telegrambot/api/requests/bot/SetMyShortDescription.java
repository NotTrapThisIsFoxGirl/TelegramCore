package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetMyShortDescription extends BaseRequest<SetMyDescription, BaseResponse> {

    public SetMyShortDescription() {
        super(BaseResponse.class);
    }

    public SetMyShortDescription setDescription(final String shortDescription) {
        add("short_description", shortDescription);
        return this;
    }

    public SetMyShortDescription setLanguageCode(final String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}