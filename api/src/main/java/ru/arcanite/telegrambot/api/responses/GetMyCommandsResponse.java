package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.bot.command.BotCommand;

@Getter
public class GetMyCommandsResponse extends BaseResponse {

    @SerializedName("result")
    private BotCommand[] commands;
}