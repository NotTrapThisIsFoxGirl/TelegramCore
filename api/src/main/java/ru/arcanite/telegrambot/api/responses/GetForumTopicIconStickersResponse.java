package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.sticker.Sticker;

import java.util.List;

@Getter
public class GetForumTopicIconStickersResponse extends BaseResponse {

    @SerializedName("result")
    private List<Sticker> stickers;
}