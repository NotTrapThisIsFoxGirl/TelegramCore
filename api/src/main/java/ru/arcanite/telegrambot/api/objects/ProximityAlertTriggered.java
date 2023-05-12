package ru.arcanite.telegrambot.api.objects;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class ProximityAlertTriggered implements BaseObject {

    private User traveler;
    private User watcher;
    private Integer distance;
}