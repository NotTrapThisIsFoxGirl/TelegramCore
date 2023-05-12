package ru.arcanite.telegrambot.api.objects.menubuttons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
@AllArgsConstructor
public class MenuButton implements BaseObject {

    private final String type;
}