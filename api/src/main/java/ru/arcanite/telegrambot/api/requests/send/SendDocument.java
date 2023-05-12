package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.BaseMultipartRequest;
import ru.arcanite.telegrambot.api.requests.ContentType;
import ru.arcanite.telegrambot.api.requests.ParseMode;

import java.io.File;

public class SendDocument extends BaseMultipartRequest<SendDocument> {

    public SendDocument(final Object chatId, final String document) {
        super(chatId, document);
    }

    public SendDocument(final Object chatId, final File document) {
        super(chatId, document);
    }

    public SendDocument(final Object chatId, final byte[] document) {
        super(chatId, document);
    }

    public SendDocument setThumbnail(final byte[] thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    public SendDocument setThumbnail(final File thumbnail) {
        return super.setThumbnail(thumbnail);
    }

    public SendDocument setCaption(final String caption) {
        return add("caption", caption);
    }

    public SendDocument setParseMode(final ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendDocument setCaptionEntities(final MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public SendDocument setDisableContentTypeDetection(final boolean disableContentTypeDetection) {
        return add("disable_content_type_detection", disableContentTypeDetection);
    }

    @Override
    protected String getFileParamName() {
        return "document";
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