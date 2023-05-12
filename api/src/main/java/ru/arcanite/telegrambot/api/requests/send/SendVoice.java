package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.BaseMultipartRequest;
import ru.arcanite.telegrambot.api.requests.ContentType;
import ru.arcanite.telegrambot.api.requests.ParseMode;

import java.io.File;

public class SendVoice extends BaseMultipartRequest<SendVoice> {

    public SendVoice(final Object chatId, final String voice) {
        super(chatId, voice);
    }

    public SendVoice(final Object chatId, final File voice) {
        super(chatId, voice);
    }

    public SendVoice(final Object chatId, final byte[] voice) {
        super(chatId, voice);
    }

    public SendVoice setCaption(final String caption) {
        return add("caption", caption);
    }

    public SendVoice setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendVoice setCaptionEntities(final MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public SendVoice setDuration(final int duration) {
        return add("duration", duration);
    }

    @Override
    protected String getFileParamName() {
        return "voice";
    }

    @Override
    public String getDefaultFileName() {
        return ContentType.VOICE.getName();
    }

    @Override
    public String getDefaultContentType() {
        return ContentType.VOICE.getMime();
    }
}