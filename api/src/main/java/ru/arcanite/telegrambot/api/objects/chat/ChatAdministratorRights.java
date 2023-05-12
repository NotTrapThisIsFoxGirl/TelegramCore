package ru.arcanite.telegrambot.api.objects.chat;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class ChatAdministratorRights implements BaseObject {

    @SerializedName("is_anonymous")
    private boolean anonymous;
    @SerializedName("can_manage_chat")
    private boolean canManageChat;
    @SerializedName("can_delete_messages")
    private boolean canDeleteMessages;
    @SerializedName("can_manage_video_chats")
    private boolean canManageVideoChats;
    @SerializedName("can_restrict_members")
    private boolean canRestrictMembers;
    @SerializedName("can_promote_members")
    private boolean canPromoteMembers;
    @SerializedName("can_change_info")
    private boolean canChangeInfo;
    @SerializedName("can_invite_users")
    private boolean canInviteUsers;
    @SerializedName("can_post_messages")
    private boolean canPostMessages;
    @SerializedName("can_edit_messages")
    private boolean canEditMessages;
    @SerializedName("can_pin_messages")
    private boolean canPinMessages;
    @SerializedName("can_manage_topics")
    private boolean canManageTopics;

    public ChatAdministratorRights setCanManageChat(final boolean canManageChat) {
        this.canManageChat = canManageChat;
        return this;
    }

    public ChatAdministratorRights setCanDeleteMessages(final boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;
        return this;
    }

    public ChatAdministratorRights setCanManageVideoChats(final boolean canManageVideoChats) {
        this.canManageVideoChats = canManageVideoChats;
        return this;
    }

    public ChatAdministratorRights setCanRestrictMembers(final boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;
        return this;
    }

    public ChatAdministratorRights setCanPromoteMembers(final boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;
        return this;
    }

    public ChatAdministratorRights setCanChangeInfo(final boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
        return this;
    }

    public ChatAdministratorRights setCanInviteUsers(final boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
        return this;
    }

    public ChatAdministratorRights setCanPostMessages(final boolean canPostMessages) {
        this.canPostMessages = canPostMessages;
        return this;
    }

    public ChatAdministratorRights setCanEditMessages(final boolean canEditMessages) {
        this.canEditMessages = canEditMessages;
        return this;
    }

    public ChatAdministratorRights setCanPinMessages(final boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
        return this;
    }

    public ChatAdministratorRights setCanManageTopics(final boolean canManageTopics) {
        this.canManageTopics = canManageTopics;
        return this;
    }
}