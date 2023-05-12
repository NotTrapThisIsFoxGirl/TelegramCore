package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.sticker.StickerSet;

@Getter
public class GetStickerSetResponse extends BaseResponse {

    @SerializedName("result")
    private StickerSet stickerSet;
}