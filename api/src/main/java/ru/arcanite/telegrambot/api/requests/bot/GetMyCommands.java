package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.objects.bot.command.scope.BotCommandScope;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetMyCommandsResponse;

public class GetMyCommands extends BaseRequest<GetMyCommands, GetMyCommandsResponse> {

    public GetMyCommands() {
        super(GetMyCommandsResponse.class);
    }

    public GetMyCommands setScope(final BotCommandScope scope) {
        add("scope", scope);
        return this;
    }

    public GetMyCommands setLanguageCode(final String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}