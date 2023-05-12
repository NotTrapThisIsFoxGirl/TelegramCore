package ru.arcanite.telegrambot.api.objects.bot.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
@AllArgsConstructor
public class BotCommand implements BaseObject {

    private final String command;
    private final String description;
}