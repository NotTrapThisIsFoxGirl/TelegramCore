package ru.arcanite.telegrambot.api.objects.chat.member;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.chat.Chat;
import ru.arcanite.telegrambot.api.objects.chat.ChatInviteLink;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class ChatMemberUpdated implements BaseObject {

    private Chat chat;
    private User from;
    private Integer date;
    @SerializedName("old_chat_member")
    private ChatMember oldChatMember;
    @SerializedName("new_chat_member")
    private ChatMember newChatMember;
    @SerializedName("invite_link")
    private ChatInviteLink inviteLink;
    @SerializedName("via_chat_folder_invite_link")
    private boolean viaChatFolderInviteLink;
}