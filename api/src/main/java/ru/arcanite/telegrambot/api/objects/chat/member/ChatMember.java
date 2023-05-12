package ru.arcanite.telegrambot.api.objects.chat.member;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class ChatMember implements BaseObject {

    private User user;
    private ChatMemberStatus status;
    @SerializedName("custom_title")
    private String customTitle;
    @SerializedName("is_anonymous")
    private boolean anonymous;
    @SerializedName("until_date")
    private Integer untilDate;
    @SerializedName("can_be_edited")
    private boolean canBeEdited;
    @SerializedName("can_manage_chat")
    private boolean canManageChat;
    @SerializedName("can_post_messages")
    private boolean canPostMessages;
    @SerializedName("can_edit_messages")
    private boolean canEditMessages;
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
    @SerializedName("can_pin_messages")
    private boolean canPinMessages;
    @SerializedName("can_manage_topics")
    private boolean canManageTopics;
    @SerializedName("is_member")
    private boolean member;
    @SerializedName("can_send_messages;")
    private boolean canSendMessages;
    @SerializedName("an_send_audios")
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
    private boolean canSndPolls;
    @SerializedName("can_send_other_messages")
    private boolean canSenOtherMessages;
    @SerializedName("can_add_web_page_previews")
    private boolean canAddWebPagePreviews;
}