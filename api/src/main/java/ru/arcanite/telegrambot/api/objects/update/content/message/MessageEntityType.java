package ru.arcanite.telegrambot.api.objects.update.content.message;

import com.google.gson.annotations.SerializedName;

public enum MessageEntityType {

    @SerializedName("bold") BOLD,
    @SerializedName("bot_command") BOT_COMMAND,
    @SerializedName("cashtag") CASHTAG,
    @SerializedName("code") CODE,
    @SerializedName("custom_emoji") CUSTOM_EMOJI,
    @SerializedName("email") EMAIL,
    @SerializedName("hashtag") HASHTAG,
    @SerializedName("italic") ITALIC,
    @SerializedName("mention") MENTION,
    @SerializedName("phone_number") PHONE_NUMBER,
    @SerializedName("pre") PRE,
    @SerializedName("spoiler") SPOILER,
    @SerializedName("strikethrough") STRIKETHROUGH,
    @SerializedName("text_link") TEXT_LINK,
    @SerializedName("text_mention") TEXT_MENTION,
    @SerializedName("underline") UNDERLINE,
    @SerializedName("url") URL
}