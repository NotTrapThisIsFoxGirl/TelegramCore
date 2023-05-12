package ru.arcanite.telegrambot.api.objects.sticker;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.utils.AttachName;

@Getter
public class InputSticker implements BaseObject {

    private final String sticker;
    @SerializedName("emoji_list")
    private final String[] emojiList;

    @SerializedName("mask_position")
    private MaskPosition maskPosition;
    private String[] keywords;

    private transient String attachName;
    private transient Object attachment;

    public InputSticker(final Object sticker, final String[] emojiList) {
        this.emojiList = emojiList;
        if (!(sticker instanceof String)) {
            this.attachment = sticker;
            this.attachName = AttachName.next();
        }
        this.sticker = sticker instanceof String ? (String) sticker : "attach://" + attachName;
    }

    public InputSticker setMaskPosition(final MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
        return this;
    }

    public InputSticker setKeywords(final String[] keywords) {
        this.keywords = keywords;
        return this;
    }
}