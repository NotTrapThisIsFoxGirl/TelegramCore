package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import javafx.scene.control.MenuButton;
import lombok.Getter;

@Getter
public class GetChatMenuButtonResponse extends BaseResponse {

    @SerializedName("result")
    private MenuButton menuButton;
}