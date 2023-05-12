package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.BaseMultipartRequest;
import ru.arcanite.telegrambot.api.requests.ContentType;
import ru.arcanite.telegrambot.api.requests.ParseMode;

import java.io.File;

public class SendPhoto extends BaseMultipartRequest<SendPhoto> {

    public SendPhoto(final Object chatId, final String photo) {
        super(chatId, photo);
    }

    public SendPhoto(final Object chatId, final File photo) {
        super(chatId, photo);
    }

    public SendPhoto(final Object chatId, final byte[] photo) {
        super(chatId, photo);
    }

    public SendPhoto setCaption(final String caption) {
        return add("caption", caption);
    }

    public SendPhoto setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendPhoto setCaptionEntities(final MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public SendPhoto setSpoiler(final boolean spoiler) {
        return add("has_spoiler", spoiler);
    }

    @Override
    protected String getFileParamName() {
        return "photo";
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