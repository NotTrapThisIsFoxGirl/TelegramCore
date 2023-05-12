package ru.arcanite.telegrambot.api.objects.chat;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.Location;

@Getter
public class ChatLocation implements BaseObject {

    private Location location;
    private String address;
}