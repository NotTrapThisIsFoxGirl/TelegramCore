package ru.arcanite.telegrambot.api.objects.chat;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class ChatJoinRequest implements BaseObject {

    private Chat chat;
    private User from;
    @SerializedName("user_chat_id")
    private Long userChatId;
    private Integer date;
    private String bio;
    @SerializedName("invite_link")
    private ChatInviteLink inviteLink;
}