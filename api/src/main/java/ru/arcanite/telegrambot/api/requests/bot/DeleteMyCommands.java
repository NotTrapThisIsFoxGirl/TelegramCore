package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.objects.bot.command.scope.BotCommandScope;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class DeleteMyCommands extends BaseRequest<DeleteMyCommands, BaseResponse> {

    public DeleteMyCommands() {
        super(BaseResponse.class);
    }

    public DeleteMyCommands setScope(final BotCommandScope scope) {
        add("scope", scope);
        return this;
    }

    public DeleteMyCommands setLanguageCode(final String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}