package ru.arcanite.telegrambot.api.requests;

import lombok.Getter;
import ru.arcanite.telegrambot.api.responses.BaseResponse;
import ru.arcanite.telegrambot.api.utils.GsonUtil;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
public abstract class BaseRequest<T extends BaseRequest<T, R>, R extends BaseResponse> {

    @SuppressWarnings("unchecked")
    protected final T instance = (T) this;

    private final boolean multipart = false;
    private final Integer timeoutSeconds = 0;
    private final Class<? extends R> responseType;
    private final Map<String, Object> parameters = new LinkedHashMap<>();

    public BaseRequest(final Class<? extends R> responseClass) {
        this.responseType = responseClass;
    }

    protected T add(final String name, final Object value) {
        parameters.put(name, value);
        return instance;
    }

    protected void addAll(final Map<String, Object> values) {
        parameters.putAll(values);
    }

    public String getMethod() {
        final String className = this.getClass().getSimpleName();
        return Character.toLowerCase(className.charAt(0)) + className.substring(1);
    }

    public String getFileName() {
        return ContentType.GENERAL.getName();
    }

    public String getContentType() {
        return ContentType.GENERAL.getMime();
    }

    public String toWebhookResponse() {
        final Map<String, Object> fullMap = new LinkedHashMap<>(parameters);
        fullMap.put("method", getMethod());
        return GsonUtil.toJson(fullMap);
    }
}