package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.bot.BotDescription;

@Getter
public class GetMyDescriptionResponse extends BaseResponse {

    @SerializedName("result")
    private BotDescription botDescription;
}