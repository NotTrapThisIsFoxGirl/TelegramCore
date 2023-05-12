package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class GetMeResponse extends BaseResponse {

    @SerializedName("result")
    private User user;
}