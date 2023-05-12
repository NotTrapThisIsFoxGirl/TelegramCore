package ru.arcanite.telegrambot.api.exceptions;

import lombok.Getter;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

@Getter
public class TelegramException extends Exception {

    private BaseResponse response;

    public TelegramException(final String message, final BaseResponse response) {
        super(message);
        this.response = response;
    }

    public TelegramException(final Exception exception) {
        super(exception);
    }
}