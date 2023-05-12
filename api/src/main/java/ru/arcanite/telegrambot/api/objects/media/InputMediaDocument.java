package ru.arcanite.telegrambot.api.objects.media;

import ru.arcanite.telegrambot.api.requests.ContentType;

import java.io.File;

public class InputMediaDocument extends InputMedia<InputMediaDocument> {

    private Boolean disable_content_type_detection;

    public InputMediaDocument(final String media) {
        super("document", media);
    }

    public InputMediaDocument(final File media) {
        super("document", media);
    }

    public InputMediaDocument(final byte[] media) {
        super("document", media);
    }

    public InputMediaDocument disableContentTypeDetection(final Boolean disableContentTypeDetection) {
        this.disable_content_type_detection = disableContentTypeDetection;
        return this;
    }

    @Override
    public String getDefaultFileName() {
        return ContentType.DOC.getName();
    }

    @Override
    public String getDefaultContentType() {
        return ContentType.DOC.getMime();
    }
}