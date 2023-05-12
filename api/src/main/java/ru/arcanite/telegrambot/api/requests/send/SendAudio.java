package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.BaseMultipartRequest;
import ru.arcanite.telegrambot.api.requests.ContentType;
import ru.arcanite.telegrambot.api.requests.ParseMode;

import java.io.File;

public class SendAudio extends BaseMultipartRequest<SendAudio> {

    public SendAudio(final Object chatId, final String audio) {
        super(chatId, audio);
    }

    public SendAudio(final Object chatId, final File audio) {
        super(chatId, audio);
    }

    public SendAudio(final Object chatId, final byte[] audio) {
        super(chatId, audio);
    }

    public SendAudio setCaption(final String caption) {
        return add("caption", caption);
    }

    public SendAudio setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendAudio setCaptionEntities(final MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public SendAudio setDuration(final int duration) {
        return add("duration", duration);
    }

    public SendAudio setPerformer(final String performer) {
        return add("performer", performer);
    }

    public SendAudio setTitle(final String title) {
        return add("title", title);
    }

    public SendAudio setThumbnail(final byte[] thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    public SendAudio setThumbnail(final File thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    @Override
    protected String getFileParamName() {
        return "audio";
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