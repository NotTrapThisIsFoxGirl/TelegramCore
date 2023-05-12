package ru.arcanite.telegrambot.api.objects.media;

import ru.arcanite.telegrambot.api.requests.ContentType;

import java.io.File;

public class InputMediaVideo extends InputMedia<InputMediaVideo> {

    private Integer width;
    private Integer height;
    private Integer duration;
    private Boolean supports_streaming;
    private Boolean has_spoiler;

    public InputMediaVideo(final String media) {
        super("video", media);
    }

    public InputMediaVideo(final File media) {
        super("video", media);
    }

    public InputMediaVideo(final byte[] media) {
        super("video", media);
    }

    public InputMediaVideo setWidth(final Integer width) {
        this.width = width;
        return this;
    }

    public InputMediaVideo setHeight(final Integer height) {
        this.height = height;
        return this;
    }

    public InputMediaVideo setDuration(final Integer duration) {
        this.duration = duration;
        return this;
    }

    public InputMediaVideo supportsStreaming(final Boolean supportsStreaming) {
        this.supports_streaming = supportsStreaming;
        return this;
    }

    public InputMediaVideo hasSpoiler(final Boolean hasSpoiler) {
        this.has_spoiler = hasSpoiler;
        return this;
    }

    @Override
    public String getDefaultFileName() {
        return ContentType.VIDEO.getName();
    }

    @Override
    public String getDefaultContentType() {
        return ContentType.VIDEO.getMime();
    }
}