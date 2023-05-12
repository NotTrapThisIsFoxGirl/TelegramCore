package ru.arcanite.telegrambot.api.requests.game;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetGameHighScoresResponse;

public class GetGameHighScores extends BaseRequest<GetGameHighScores, GetGameHighScoresResponse> {

    public GetGameHighScores(final long userId, final Object chatId, final int messageId) {
        super(GetGameHighScoresResponse.class);
        add("user_id", userId);
        add("chat_id", chatId);
        add("message_id", messageId);
    }

    public GetGameHighScores(final long userId, final String inlineMessageId) {
        super(GetGameHighScoresResponse.class);
        add("user_id", userId);
        add("inline_message_id", inlineMessageId);
    }
}