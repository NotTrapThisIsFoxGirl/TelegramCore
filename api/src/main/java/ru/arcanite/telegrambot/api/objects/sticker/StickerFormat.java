package ru.arcanite.telegrambot.api.objects.sticker;

import com.google.gson.annotations.SerializedName;

public enum StickerFormat {

    @SerializedName("animated") ANIMATED,
    @SerializedName("static") STATIC,
    @SerializedName("video") VIDEO
}