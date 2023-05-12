package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.requests.BaseSendRequest;

public class SendGame extends BaseSendRequest<SendGame> {

    public SendGame(final Object chatId, final String gameShortName) {
        super(chatId);
        add("game_short_name", gameShortName);
    }
}