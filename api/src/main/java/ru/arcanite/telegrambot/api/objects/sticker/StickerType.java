package ru.arcanite.telegrambot.api.objects.sticker;

import com.google.gson.annotations.SerializedName;

public enum StickerType {

    @SerializedName("custom_emoji") CUSTOM_EMOJI,
    @SerializedName("mask") MASK,
    @SerializedName("regular") REGULAR
}