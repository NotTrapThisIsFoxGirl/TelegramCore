package ru.arcanite.telegrambot.api.requests.game;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;
import ru.arcanite.telegrambot.api.responses.SendResponse;

public class SetGameScore extends BaseRequest<SetGameScore, BaseResponse> {

    public SetGameScore(final long userId, final int score, final Object chatId, final int messageId) {
        super(SendResponse.class);
        add("user_id", userId);
        add("score", score);
        add("chat_id", chatId);
        add("message_id", messageId);
    }

    public SetGameScore(final long userId, final int score, final String inlineMessageId) {
        super(BaseResponse.class);
        add("user_id", userId);
        add("score", score);
        add("inline_message_id", inlineMessageId);
    }

    public SetGameScore setForce(final boolean force) {
        return add("force", force);
    }

    public SetGameScore setDisableEditMessage(final boolean disableEditMessage) {
        return add("disable_edit_message", disableEditMessage);
    }
}