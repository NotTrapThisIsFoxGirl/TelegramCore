package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class StringResponse extends BaseResponse {

    @SerializedName("result")
    private String string;
}