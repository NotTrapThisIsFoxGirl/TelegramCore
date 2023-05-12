package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.sticker.Sticker;

@Getter
public class GetCustomEmojiStickersResponse extends BaseResponse {

    @SerializedName("result")
    private Sticker[] stickers;
}