package ru.arcanite.telegrambot.api.handlers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UpdatesResponseType {

    ALL(-1),
    NONE(-2);

    private final int value;
}