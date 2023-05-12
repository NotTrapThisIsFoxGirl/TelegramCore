package ru.arcanite.telegrambot.api;

import com.google.gson.Gson;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import ru.arcanite.telegrambot.api.handlers.Callback;
import ru.arcanite.telegrambot.api.objects.file.InputFile;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TelegramBotClient {

    private final OkHttpClient client;
    private final Gson gson;
    private final String baseUrl;

    private OkHttpClient clientWithTimeout;

    public TelegramBotClient(final OkHttpClient client, final Gson gson, final String baseUrl) {
        this.client = client;
        this.gson = gson;
        this.baseUrl = baseUrl;
        this.clientWithTimeout = client;
    }

    public <T extends BaseRequest<T, R>, R extends BaseResponse> void sendAsync(final T request, final Callback<T, R> callback) {
        final OkHttpClient client = getOkHttpClient(request);
        client.newCall(createRequest(request)).enqueue(new okhttp3.Callback() {
            @Override
            public void onResponse(@NotNull final Call call, @NotNull final Response response) {
                R result = null;
                Exception resultException = null;
                try {
                    final String responseBody = response.body() != null ? response.body().string() : null;
                    result = gson.fromJson(responseBody, request.getResponseType());
                } catch (final Exception exception) {
                    resultException = exception instanceof IOException ? exception : new IOException(exception);
                }
                if (result != null) {
                    callback.onResponse(request, result);
                    return;
                }
                if (resultException == null) {
                    callback.onFailure(request, new IOException("Empty response"));
                    return;
                }
                final IOException exception = (IOException) resultException;
                callback.onFailure(request, exception);
            }

            @Override
            public void onFailure(@NotNull final Call call, @NotNull final IOException exception) {
                callback.onFailure(request, exception);
            }
        });
    }

    public <T extends BaseRequest<T, R>, R extends BaseResponse> R send(final BaseRequest<T, R> request) {
        try {
            final OkHttpClient client = getOkHttpClient(request);
            final Response response = client.newCall(createRequest(request)).execute();
            final String responseBody = response.body() != null ? response.body().string() : null;
            return gson.fromJson(responseBody, request.getResponseType());
        } catch (final IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void shutdown() {
        client.dispatcher().executorService().shutdown();
    }

    private Request createRequest(final BaseRequest<?, ?> request) {
        return new Request.Builder().url(baseUrl + request.getMethod()).post(createRequestBody(request)).build();
    }

    private RequestBody createRequestBody(final BaseRequest<?, ?> request) {
        if (!request.isMultipart()) {
            final FormBody.Builder builder = new FormBody.Builder();
            request.getParameters().forEach((key, value) -> builder.add(key, toParamValue(value)));
            return builder.build();
        }
        MediaType contentType = MediaType.parse(request.getContentType());
        final MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (final Map.Entry<String, Object> parameter : request.getParameters().entrySet()) {
            final String name = parameter.getKey();
            final Object value = parameter.getValue();
            if (value instanceof byte[]) {
                builder.addFormDataPart(name, request.getFileName(), RequestBody.create((byte[]) value, contentType));
            } else if (value instanceof File) {
                builder.addFormDataPart(name, request.getFileName(), RequestBody.create((File) value, contentType));
            } else if (value instanceof InputFile) {
                final InputFile inputFile = (InputFile) value;
                contentType = MediaType.parse(inputFile.getContentType());
                final RequestBody body = inputFile.getFile() != null
                        ? RequestBody.create(inputFile.getFile(), contentType)
                        : RequestBody.create(inputFile.getBytes(), contentType);
                builder.addFormDataPart(name, ((InputFile) value).getFileName(), body);
            } else {
                builder.addFormDataPart(name, toParamValue(value));
            }
        }
        return builder.build();
    }

    private OkHttpClient getOkHttpClient(final BaseRequest<?, ?> request) {
        final int timeoutMillis = request.getTimeoutSeconds() * 1000;
        if (client.readTimeoutMillis() == 0 || client.readTimeoutMillis() > timeoutMillis) return client;
        if (clientWithTimeout.readTimeoutMillis() > timeoutMillis) return clientWithTimeout;
        this.clientWithTimeout = client.newBuilder().readTimeout(timeoutMillis + 1000, TimeUnit.MILLISECONDS).build();
        return clientWithTimeout;
    }

    private String toParamValue(final Object value) {
        return value.getClass().isPrimitive() || value.getClass().isEnum() || value.getClass().getName().startsWith("java.lang")
                ? String.valueOf(value)
                : gson.toJson(value);
    }
}