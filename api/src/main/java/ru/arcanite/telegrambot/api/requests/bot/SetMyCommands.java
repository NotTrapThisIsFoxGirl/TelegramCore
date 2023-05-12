package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.objects.bot.command.BotCommand;
import ru.arcanite.telegrambot.api.objects.bot.command.scope.BotCommandScope;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetMyCommands extends BaseRequest<SetMyCommands, BaseResponse> {

    public SetMyCommands(final BotCommand... commands) {
        super(BaseResponse.class);
        add("commands", commands);
    }

    public SetMyCommands setScope(final BotCommandScope scope) {
        add("scope", scope);
        return this;
    }

    public SetMyCommands setLanguageCode(final String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}