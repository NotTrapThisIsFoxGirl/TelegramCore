package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.WebhookInfo;

@Getter
public class GetWebhookInfoResponse extends BaseResponse {

    @SerializedName("result")
    private WebhookInfo webhookInfo;
}