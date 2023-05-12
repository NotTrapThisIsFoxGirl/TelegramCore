package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.BaseMultipartRequest;
import ru.arcanite.telegrambot.api.requests.ContentType;
import ru.arcanite.telegrambot.api.requests.ParseMode;

import java.io.File;

public class SendVideo extends BaseMultipartRequest<SendVideo> {

    public SendVideo(final Object chatId, final String video) {
        super(chatId, video);
    }

    public SendVideo(final Object chatId, final File video) {
        super(chatId, video);
    }

    public SendVideo(final Object chatId, final byte[] video) {
        super(chatId, video);
    }

    public SendVideo setDuration(final int duration) {
        return add("duration", duration);
    }

    public SendVideo setWidth(final int width) {
        return add("width", width);
    }

    public SendVideo setHeight(final int height) {
        return add("height", height);
    }

    public SendVideo setThumbnail(final byte[] thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    public SendVideo setThumbnail(final File thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    public SendVideo setCaption(final String caption) {
        return add("caption", caption);
    }

    public SendVideo setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendVideo setCaptionEntities(final MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public SendVideo setSupportsStreaming(final boolean supportsStreaming) {
        return add("supports_streaming", supportsStreaming);
    }

    public SendVideo setSpoiler(final boolean spoiler) {
        return add("has_spoiler", spoiler);
    }

    @Override
    protected String getFileParamName() {
        return "video";
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