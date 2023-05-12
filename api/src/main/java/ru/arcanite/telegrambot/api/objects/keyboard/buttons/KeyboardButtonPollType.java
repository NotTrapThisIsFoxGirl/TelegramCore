package ru.arcanite.telegrambot.api.objects.keyboard.buttons;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.update.content.poll.PollType;

@Getter
public class KeyboardButtonPollType implements BaseObject {

    private final String type;

    public KeyboardButtonPollType(final String type) {
        this.type = type;
    }

    public KeyboardButtonPollType(final PollType type) {
        this(type.name());
    }
}