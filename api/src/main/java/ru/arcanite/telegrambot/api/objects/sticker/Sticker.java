package ru.arcanite.telegrambot.api.objects.sticker;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.PhotoSize;
import ru.arcanite.telegrambot.api.objects.file.File;

@Getter
public class Sticker implements BaseObject {

    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    private StickerType type;
    private Integer width;
    private Integer height;
    @SerializedName("is_animated")
    private boolean animated;
    @SerializedName("is_video")
    private boolean video;
    private PhotoSize thumbnail;
    private String emoji;
    @SerializedName("set_name")
    private String setName;
    @SerializedName("premium_annotation")
    private File premiumAnimation;
    @SerializedName("mask_position")
    private MaskPosition maskPosition;
    @SerializedName("custom_emoji_id")
    private String customEmojiId;
    @SerializedName("needs_repainting")
    private boolean needsRepainting;
    @SerializedName("file_size")
    private Long fileSize;
}