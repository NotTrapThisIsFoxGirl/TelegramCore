package ru.arcanite.telegrambot.api.objects.media;

import ru.arcanite.telegrambot.api.requests.ContentType;

import java.io.File;

public class InputMediaPhoto extends InputMedia<InputMediaPhoto> {

    private Boolean has_spoiler;

    public InputMediaPhoto(final String media) {
        super("photo", media);
    }

    public InputMediaPhoto(final File media) {
        super("photo", media);
    }

    public InputMediaPhoto(final byte[] media) {
        super("photo", media);
    }

    public InputMediaPhoto hasSpoiler(final Boolean hasSpoiler) {
        this.has_spoiler = hasSpoiler;
        return this;
    }

    @Override
    public String getDefaultFileName() {
        return ContentType.PHOTO.getName();
    }

    @Override
    public String getDefaultContentType() {
        return ContentType.PHOTO.getMime();
    }
}