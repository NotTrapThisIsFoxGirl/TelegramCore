package ru.arcanite.telegrambot.api.objects.user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class UserShared implements BaseObject {

    @SerializedName("request_id")
    private Integer requestId;
    @SerializedName("user_id")
    private Long userId;
}