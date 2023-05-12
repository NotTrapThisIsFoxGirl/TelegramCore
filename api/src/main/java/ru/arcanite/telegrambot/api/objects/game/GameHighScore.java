package ru.arcanite.telegrambot.api.objects.game;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class GameHighScore implements BaseObject {

    private Integer position;
    private User user;
    private Integer score;
}