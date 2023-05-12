package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetMyDescription extends BaseRequest<SetMyDescription, BaseResponse> {

    public SetMyDescription() {
        super(BaseResponse.class);
    }

    public SetMyDescription setDescription(final String description) {
        add("description", description);
        return this;
    }

    public SetMyDescription setLanguageCode(final String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}