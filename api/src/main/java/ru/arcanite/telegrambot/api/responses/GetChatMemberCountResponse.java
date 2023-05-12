package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class GetChatMemberCountResponse extends BaseResponse {

    @SerializedName("result")
    private Integer count;
}