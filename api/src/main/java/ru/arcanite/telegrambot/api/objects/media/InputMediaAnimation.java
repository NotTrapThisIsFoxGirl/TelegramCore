package ru.arcanite.telegrambot.api.objects.media;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.ContentType;

import java.io.File;

@Getter
public class InputMediaAnimation extends InputMedia<InputMediaAnimation> {

    private Integer width;
    private Integer height;
    private Integer duration;
    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    public InputMediaAnimation(final String media) {
        super("animation", media);
    }

    public InputMediaAnimation(final File media) {
        super("animation", media);
    }

    public InputMediaAnimation(final byte[] media) {
        super("animation", media);
    }

    public InputMediaAnimation setWidth(final Integer width) {
        this.width = width;
        return this;
    }

    public InputMediaAnimation setHeight(final Integer height) {
        this.height = height;
        return this;
    }

    public InputMediaAnimation setDuration(final Integer duration) {
        this.duration = duration;
        return this;
    }

    public InputMediaAnimation setSpoiler(final Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
        return this;
    }

    @Override
    public String getDefaultFileName() {
        return ContentType.GIF.getName();
    }

    @Override
    public String getDefaultContentType() {
        return ContentType.GIF.getMime();
    }
}