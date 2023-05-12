package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class InlineQueryResultGame extends InlineQueryResult<InlineQueryResultGame> {

    @SerializedName("game_short_game")
    private final String gameShortName;

    public InlineQueryResultGame(final String id, final String gameShortName) {
        super("game", id);
        this.gameShortName = gameShortName;
    }
}