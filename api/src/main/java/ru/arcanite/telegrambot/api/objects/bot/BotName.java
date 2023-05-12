package ru.arcanite.telegrambot.api.objects.bot;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class BotName implements BaseObject {

    private String name;
}