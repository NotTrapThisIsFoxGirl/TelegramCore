package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.Update;

import java.util.List;

@Getter
public class GetUpdatesResponse extends BaseResponse {

    @SerializedName("result")
    private List<Update> updates;
}