package ru.arcanite.telegrambot.api.objects.media;

import ru.arcanite.telegrambot.api.requests.ContentType;

import java.io.File;

public class InputMediaAudio extends InputMedia<InputMediaAudio> {

    private Integer duration;
    private String performer;
    private String title;

    public InputMediaAudio(final String media) {
        super("audio", media);
    }

    public InputMediaAudio(final File media) {
        super("audio", media);
    }

    public InputMediaAudio(final byte[] media) {
        super("audio", media);
    }

    public InputMediaAudio setDuration(final Integer duration) {
        this.duration = duration;
        return this;
    }

    public InputMediaAudio setPerformer(final String performer) {
        this.performer = performer;
        return this;
    }

    public InputMediaAudio setTitle(final String title) {
        this.title = title;
        return this;
    }

    @Override
    public String getDefaultFileName() {
        return ContentType.AUDIO.getName();
    }

    @Override
    public String getDefaultContentType() {
        return ContentType.AUDIO.getMime();
    }
}