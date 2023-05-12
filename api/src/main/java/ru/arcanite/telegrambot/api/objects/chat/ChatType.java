package ru.arcanite.telegrambot.api.objects.chat;

import com.google.gson.annotations.SerializedName;

public enum ChatType {

    @SerializedName("channel") CHANNEL,
    @SerializedName("group") GROUP,
    @SerializedName("private") PRIVATE,
    @SerializedName("supergroup") SUPERGROUP
}