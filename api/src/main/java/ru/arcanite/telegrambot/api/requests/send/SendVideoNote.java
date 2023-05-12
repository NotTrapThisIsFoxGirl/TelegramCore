package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.requests.BaseMultipartRequest;
import ru.arcanite.telegrambot.api.requests.ContentType;

import java.io.File;

public class SendVideoNote extends BaseMultipartRequest<SendVideoNote> {

    public SendVideoNote(final Object chatId, final String videoNote) {
        super(chatId, videoNote);
    }

    public SendVideoNote(final Object chatId, final File videoNote) {
        super(chatId, videoNote);
    }

    public SendVideoNote(final Object chatId, final byte[] videoNote) {
        super(chatId, videoNote);
    }

    public SendVideoNote setDuration(final int duration) {
        return add("duration", duration);
    }

    public SendVideoNote setLength(final int length) {
        return add("length", length);
    }

    public SendVideoNote setThumbnail(final byte[] thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    public SendVideoNote setThumbnail(final File thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    @Override
    protected String getFileParamName() {
        return "video_note";
    }

    @Override
    protected String getDefaultFileName() {
        return ContentType.VIDEO.getName();
    }

    @Override
    public String getDefaultContentType() {
        return ContentType.VIDEO.getMime();
    }
}