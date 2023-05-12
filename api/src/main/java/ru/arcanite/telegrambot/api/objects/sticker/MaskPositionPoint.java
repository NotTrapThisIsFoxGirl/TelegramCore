package ru.arcanite.telegrambot.api.objects.sticker;

import com.google.gson.annotations.SerializedName;

public enum MaskPositionPoint {

    @SerializedName("chin") CHIN,
    @SerializedName("eyes") EYES,
    @SerializedName("forehead") FOREHEAD,
    @SerializedName("mouth") MOUTH
}