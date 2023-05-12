package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.requests.BaseMultipartRequest;
import ru.arcanite.telegrambot.api.requests.ContentType;

import java.io.File;

public class SendSticker extends BaseMultipartRequest<SendSticker> {

    public SendSticker(final Object chatId, final String sticker) {
        super(chatId, sticker);
    }

    public SendSticker(final Object chatId, final File sticker) {
        super(chatId, sticker);
    }

    public SendSticker(final Object chatId, final byte[] sticker) {
        super(chatId, sticker);
    }

    public SendSticker setEmoji(final String emoji) {
        add("emoji", emoji);
        return this;
    }

    public SendSticker setThumbnail(final byte[] thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    public SendSticker setThumbnail(final File thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    @Override
    protected String getFileParamName() {
        return "sticker";
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