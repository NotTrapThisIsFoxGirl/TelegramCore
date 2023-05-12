package ru.arcanite.telegrambot.api.objects.webapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
@AllArgsConstructor
public class WebAppInfo implements BaseObject {

    private final String url;
}