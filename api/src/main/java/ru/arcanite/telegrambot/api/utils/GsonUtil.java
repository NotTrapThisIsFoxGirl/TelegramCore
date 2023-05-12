package ru.arcanite.telegrambot.api.utils;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GsonUtil {

    @Getter
    private final Gson gson = new Gson();

    public <R> R fromJson(final String json, final Class<R> responseClass) {
        return gson.fromJson(json, responseClass);
    }

    public String toJson(final Object value) {
        return gson.toJson(value);
    }
}