package ru.arcanite.telegrambot.api.objects.bot;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class BotDescription implements BaseObject {

    private String description;
}