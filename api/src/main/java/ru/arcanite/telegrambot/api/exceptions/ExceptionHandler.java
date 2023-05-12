package ru.arcanite.telegrambot.api.exceptions;

public interface ExceptionHandler {

    void onException(TelegramException exception);
}