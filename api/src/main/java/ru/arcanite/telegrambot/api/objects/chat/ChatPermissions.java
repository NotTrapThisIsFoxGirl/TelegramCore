package ru.arcanite.telegrambot.api.objects.chat;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class ChatPermissions implements BaseObject {

    @SerializedName("can_send_messages")
    private boolean canSendMessages;
    @SerializedName("can_send_audios")
    private boolean canSendAudios;
    @SerializedName("can_send_documents")
    private boolean canSendDocuments;
    @SerializedName("can_send_photos")
    private boolean canSendPhotos;
    @SerializedName("can_send_videos")
    private boolean canSendVideos;
    @SerializedName("can_send_video_notes")
    private boolean canSendVideoNotes;
    @SerializedName("can_send_voice_notes")
    private boolean canSendVoiceNotes;
    @SerializedName("can_send_polls")
    private boolean canSendPolls;
    @SerializedName("can_send_other_messages")
    private boolean canSendOtherMessages;
    @SerializedName("can_add_web_page_previews")
    private boolean canAddWebPagePreviews;
    @SerializedName("can_change_info")
    private boolean canChangeInfo;
    @SerializedName("can_invite_users")
    private boolean canInviteUsers;
    @SerializedName("can_pin_messages")
    private boolean canPinMessages;
    @SerializedName("can_manage_topics")
    private boolean canManageTopics;

    public ChatPermissions setCanSendMessages(final boolean canSendMessages) {
        this.canSendMessages = canSendMessages;
        return this;
    }

    public ChatPermissions setCanSendAudios(final boolean canSendAudios) {
        this.canSendAudios = canSendAudios;
        return this;
    }

    public ChatPermissions setCanSendDocuments(final boolean canSendDocuments) {
        this.canSendDocuments = canSendDocuments;
        return this;
    }

    public ChatPermissions setCanSendPhotos(final boolean canSendPhotos) {
        this.canSendPhotos = canSendPhotos;
        return this;
    }

    public ChatPermissions setCanSendVideos(final boolean canSendVideos) {
        this.canSendVideos = canSendVideos;
        return this;
    }

    public ChatPermissions setCanSendVideoNotes(final boolean canSendVideoNotes) {
        this.canSendVideoNotes = canSendVideoNotes;
        return this;
    }

    public ChatPermissions setCanSendVoiceNotes(final boolean canSendVoiceNotes) {
        this.canSendVoiceNotes = canSendVoiceNotes;
        return this;
    }

    public ChatPermissions setCanSendPolls(final boolean canSendPolls) {
        this.canSendPolls = canSendPolls;
        return this;
    }

    public ChatPermissions setCanSendOtherMessages(final boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;
        return this;
    }

    public ChatPermissions setCanAddWebPagePreviews(final boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;
        return this;
    }

    public ChatPermissions setCanChangeInfo(final boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
        return this;
    }

    public ChatPermissions setCanInviteUsers(final boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
        return this;
    }

    public ChatPermissions setCanPinMessages(final boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
        return this;
    }

    public ChatPermissions setCanManageTopics(final boolean canManageTopics) {
        this.canManageTopics = canManageTopics;
        return this;
    }
}