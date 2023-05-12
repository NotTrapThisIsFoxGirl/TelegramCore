package ru.arcanite.telegrambot.api.objects.videochat;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.user.User;

import java.util.List;

@Getter
public class VideoChatParticipantsInvited implements BaseObject {

    private List<User> users;
}