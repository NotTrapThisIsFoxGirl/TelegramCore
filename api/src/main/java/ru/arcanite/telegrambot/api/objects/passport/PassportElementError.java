package ru.arcanite.telegrambot.api.objects.passport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
@AllArgsConstructor
public abstract class PassportElementError implements BaseObject {

    private final String source;
    private final String type;
    private final String message;
}