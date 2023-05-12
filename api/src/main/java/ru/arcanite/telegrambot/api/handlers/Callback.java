package ru.arcanite.telegrambot.api.handlers;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

import java.io.IOException;

public interface Callback<T extends BaseRequest<T, R>, R extends BaseResponse> {

    void onResponse(final T method, final R response);

    void onFailure(final T method, final IOException exception);
}