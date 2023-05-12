package ru.arcanite.telegrambot.api.objects;

import lombok.Getter;

@Getter
public class Dice implements BaseObject {

    private String emoji;
    private Integer value;
}