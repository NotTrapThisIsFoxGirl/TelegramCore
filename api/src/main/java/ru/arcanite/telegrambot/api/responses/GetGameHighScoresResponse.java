package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.game.GameHighScore;

@Getter
public class GetGameHighScoresResponse extends BaseResponse {

    @SerializedName("result")
    private GameHighScore[] scores;
}