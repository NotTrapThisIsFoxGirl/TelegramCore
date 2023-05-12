package ru.arcanite.telegrambot.api.objects.update.content.poll;

import com.google.gson.annotations.SerializedName;

public enum PollType {

    @SerializedName("quiz") QUIZ,
    @SerializedName("regular") REGULAR
}