package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.chat.ChatAdministratorRights;

@Getter
public class GetMyDefaultAdministratorRightsResponse extends BaseResponse {

    @SerializedName("result")
    private ChatAdministratorRights rights;
}