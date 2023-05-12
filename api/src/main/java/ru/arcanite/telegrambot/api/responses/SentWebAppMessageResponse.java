package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.webapp.SentWebAppMessage;

@Getter
public class SentWebAppMessageResponse extends BaseResponse {

    @SerializedName("result")
    private SentWebAppMessage sentWebAppMessage;
}