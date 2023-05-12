package ru.arcanite.telegrambot.api.requests;

import com.google.gson.annotations.SerializedName;

public enum ParseMode {

    @SerializedName("HTML") HTML,
    @SerializedName("Markdown") MARKDOWN,
    @SerializedName("MarkdownV2") MARKDOWN_V2
}