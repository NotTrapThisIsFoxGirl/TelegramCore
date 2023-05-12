package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.bot.BotName;

@Getter
public class GetMyNameResponse extends BaseResponse {

    @SerializedName("result")
    private BotName name;
}