package ru.arcanite.telegrambot.api.objects.sticker;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.PhotoSize;

@Getter
public class StickerSet implements BaseObject {

    private String name;
    private String title;
    @SerializedName("sticker_type")
    private StickerType stickerType;
    @SerializedName("is_animated")
    private boolean animated;
    @SerializedName("is_video")
    private boolean video;
    @SerializedName("contains_masks")
    private boolean containsMasks;
    private Sticker[] stickers;
    private PhotoSize thumbnail;
}