package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetMyName extends BaseRequest<SetMyName, BaseResponse> {

    public SetMyName() {
        super(BaseResponse.class);
    }

    public SetMyName setName(final String name) {
        add("name", name);
        return this;
    }

    public SetMyName setLanguageCode(final String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}