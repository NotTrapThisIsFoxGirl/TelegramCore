package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.BaseMultipartRequest;
import ru.arcanite.telegrambot.api.requests.ContentType;
import ru.arcanite.telegrambot.api.requests.ParseMode;

import java.io.File;

public class SendAnimation extends BaseMultipartRequest<SendAnimation> {

    public SendAnimation(final Object chatId, final String animation) {
        super(chatId, animation);
    }

    public SendAnimation(final Object chatId, final File animation) {
        super(chatId, animation);
    }

    public SendAnimation(final Object chatId, final byte[] animation) {
        super(chatId, animation);
    }

    public SendAnimation setDuration(final int duration) {
        return add("duration", duration);
    }

    public SendAnimation setWidth(final int width) {
        return add("width", width);
    }

    public SendAnimation setHeight(final int height) {
        return add("height", height);
    }

    public SendAnimation setThumbnail(final byte[] thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    public SendAnimation setThumbnail(final File thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    public SendAnimation setCaption(final String caption) {
        return add("caption", caption);
    }

    public SendAnimation setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendAnimation setCaptionEntities(final MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public SendAnimation setSpoiler(final boolean spoiler) {
        return add("has_spoiler", spoiler);
    }

    @Override
    protected String getFileParamName() {
        return "animation";
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