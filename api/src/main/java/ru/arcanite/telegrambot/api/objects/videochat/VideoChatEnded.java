package ru.arcanite.telegrambot.api.objects.videochat;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class VideoChatEnded implements BaseObject {

    private Integer duration;
}