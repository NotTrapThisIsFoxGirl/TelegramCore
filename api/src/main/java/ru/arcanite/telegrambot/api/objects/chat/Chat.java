package ru.arcanite.telegrambot.api.objects.chat;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.update.content.message.Message;

@Getter
public class Chat implements BaseObject {

    private Long id;
    private ChatType type;
    private String title;
    private String username;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("is_forum")
    private boolean forum;
    private ChatPhoto photo;
    @SerializedName("active_usernames")
    private String[] activeUsernames;
    @SerializedName("emoji_status_custom_emoji_id")
    private String emojiStatusCustomEmojiId;
    private String bio;
    @SerializedName("has_private_forwards")
    private boolean privateForwards;
    @SerializedName("has_restricted_voice_and_video_messages")
    private boolean restrictedVoiceAndVideoMessages;
    @SerializedName("has_hidden_members")
    private boolean hiddenMembers;
    @SerializedName("has_aggressive_anti_spam_enabled")
    private boolean aggressiveAntiSpamEnabled;
    @SerializedName("join_to_send_messages")
    private boolean joinToSendMessages;
    @SerializedName("join_by_request")
    private boolean joinByRequest;
    private String description;
    @SerializedName("invite_link")
    private String inviteLink;
    @SerializedName("pinned_message")
    private Message pinnedMessage;
    private ChatPermissions permissions;
    @SerializedName("slow_mode_delay")
    private Integer slowModeDelay;
    @SerializedName("message_auto_delete_time")
    private Integer messageAutoDeleteTime;
    @SerializedName("has_protected_content")
    private boolean protectedContent;
    @SerializedName("sticker_set_name")
    private String stickerSetName;
    @SerializedName("can_set_sticker_set")
    private boolean canSetStickerSet;
    @SerializedName("linked_chat_id")
    private Long linkedChatId;
    private ChatLocation location;
}