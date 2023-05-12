package ru.arcanite.telegrambot.api.objects.videochat;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class VideoChatScheduled implements BaseObject {

    @SerializedName("start_date")
    private Integer startDate;
}