package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.ResponseParameters;

@Getter
public class BaseResponse {

    private boolean ok;
    @SerializedName("error_code")
    private Integer errorCode;
    private String description;
    private ResponseParameters parameters;
}