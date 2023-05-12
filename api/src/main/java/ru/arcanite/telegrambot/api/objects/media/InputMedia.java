package ru.arcanite.telegrambot.api.objects.media;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.file.InputFile;
import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.requests.ParseMode;
import ru.arcanite.telegrambot.api.utils.AttachName;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Getter
public abstract class InputMedia<T extends InputMedia<T>> implements BaseObject {

    @SuppressWarnings("unchecked")
    protected final T instance = (T) this;

    private final String type;
    private final String media;

    private String thumbnail;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;
    @SerializedName("caption_entities")
    private MessageEntity[] captionEntities;

    private transient final Map<String, Object> attachments = new HashMap<>();
    
    private transient InputFile inputFile;
    private transient String inputFileId;
    private transient String fileName;
    private transient String contentType;

    public InputMedia(final String type, final Object media) {
        this.type = type;
        if (media instanceof String) {
            this.media = (String) media;
            return;
        }
        final String attachName = AttachName.next();
        this.media = "attach://" + attachName;
        this.inputFileId = attachName;
        if (!(media instanceof File)) {
            this.inputFile = new InputFile((byte[]) media, getFileName(), getContentType());
            return;
        }
        this.fileName = ((File) media).getName();
        this.inputFile = new InputFile((File) media, getFileName(), getContentType());
    }

    public T setThumbnail(final File thumbnail) {
        final String attachName = AttachName.next();
        attachments.put(attachName, thumbnail);
        this.thumbnail = "attach://" + attachName;
        return instance;
    }

    public T setThumbnail(final byte[] thumbnail) {
        final String attachName = AttachName.next();
        attachments.put(attachName, thumbnail);
        this.thumbnail = "attach://" + attachName;
        return instance;
    }

    public T setCaption(final String caption) {
        this.caption = caption;
        return instance;
    }

    public T setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return instance;
    }

    public T setCaptionEntities(final MessageEntity... entities) {
        this.captionEntities = entities;
        return instance;
    }

    public T setFileName(final String fileName) {
        if (inputFile != null) {
            inputFile.setFileName(fileName);
        }
        this.fileName = fileName;
        return instance;
    }

    public T setContentType(final String contentType) {
        if (inputFile != null) {
            inputFile.setContentType(contentType);
        }
        this.contentType = contentType;
        return instance;
    }

    public String getFileName() {
        return fileName != null && !fileName.isEmpty() ? fileName : getDefaultFileName();
    }

    public String getContentType() {
        return contentType != null && !contentType.isEmpty() ? contentType : getDefaultContentType();
    }

    protected abstract String getDefaultFileName();

    protected abstract String getDefaultContentType();
}