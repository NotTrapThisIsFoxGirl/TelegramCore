package ru.arcanite.telegrambot.api.requests;

import lombok.Getter;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

import java.io.File;

@Getter
public abstract class BaseUploadRequest<T extends BaseRequest<T, R>, R extends BaseResponse> extends BaseRequest<T, R> {

    private final boolean multipart;

    public BaseUploadRequest(final Class<? extends R> responseClass, final String paramName, final Object data) {
        super(responseClass);
        if (!(data instanceof String) && !(data instanceof File) && !(data instanceof byte[])) {
            throw new IllegalArgumentException("Sending data should be String, File or byte[]");
        }
        this.multipart = !(data instanceof String);
        add(paramName, data);
    }
}