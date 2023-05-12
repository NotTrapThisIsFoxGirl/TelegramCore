package ru.arcanite.telegrambot.api.requests;

import lombok.Getter;

import java.io.File;

public abstract class BaseMultipartRequest<T extends BaseMultipartRequest<T>> extends BaseSendRequest<T> {

    @Getter
    private boolean multipart;
    private String fileName;
    private String contentType;

    public BaseMultipartRequest(final Object chatId, final Object file) {
        super(chatId);
        if (!(file instanceof String) && !(file instanceof File) && !(file instanceof byte[])) {
            throw new IllegalArgumentException("Sending data should be String, File or byte[]");
        }
        this.multipart = !(file instanceof String);
        if (file instanceof File) {
            this.fileName = ((File) file).getName();
        }
        add(getFileParamName(), file);
    }

    public T setFileName(final String fileName) {
        this.fileName = fileName;
        return instance;
    }

    public T setContentType(final String contentType) {
        this.contentType = contentType;
        return instance;
    }

    protected T setThumbnail(final Object thumbnail) {
        this.multipart = true;
        return add("thumbnail", thumbnail);
    }

    @Override
    public String getFileName() {
        return fileName != null && !fileName.isEmpty() ? fileName : getDefaultFileName();
    }

    @Override
    public String getContentType() {
        return contentType != null && !contentType.isEmpty() ? contentType : getDefaultContentType();
    }

    protected abstract String getDefaultFileName();

    protected abstract String getDefaultContentType();

    protected abstract String getFileParamName();
}