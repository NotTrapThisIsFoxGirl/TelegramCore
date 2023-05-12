package ru.arcanite.telegrambot.api.objects.update.content.message;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.*;
import ru.arcanite.telegrambot.api.objects.chat.Chat;
import ru.arcanite.telegrambot.api.objects.chat.ChatShared;
import ru.arcanite.telegrambot.api.objects.forum.*;
import ru.arcanite.telegrambot.api.objects.game.Animation;
import ru.arcanite.telegrambot.api.objects.game.Game;
import ru.arcanite.telegrambot.api.objects.keyboard.markup.InlineKeyboardMarkup;
import ru.arcanite.telegrambot.api.objects.passport.PassportData;
import ru.arcanite.telegrambot.api.objects.sticker.Sticker;
import ru.arcanite.telegrambot.api.objects.update.content.payment.Invoice;
import ru.arcanite.telegrambot.api.objects.update.content.payment.SuccessfulPayment;
import ru.arcanite.telegrambot.api.objects.update.content.poll.Poll;
import ru.arcanite.telegrambot.api.objects.user.User;
import ru.arcanite.telegrambot.api.objects.user.UserShared;
import ru.arcanite.telegrambot.api.objects.videochat.VideoChatEnded;
import ru.arcanite.telegrambot.api.objects.videochat.VideoChatParticipantsInvited;
import ru.arcanite.telegrambot.api.objects.videochat.VideoChatScheduled;
import ru.arcanite.telegrambot.api.objects.videochat.VideoChatStarted;
import ru.arcanite.telegrambot.api.objects.webapp.WebAppData;

@Getter
public class Message implements BaseObject {

    @SerializedName("message_id")
    private Integer id;
    @SerializedName("message_thread_id")
    private Integer messageThreadId;
    private User from;
    @SerializedName("sender_chat")
    private Chat senderChat;
    private Integer date;
    private Chat chat;
    @SerializedName("forward_from")
    private User forwardFrom;
    @SerializedName("forward_from_chat")
    private Chat forwardFromChat;
    @SerializedName("forward_from_message_id")
    private Integer forwardFromMessageId;
    @SerializedName("forward_signature")
    private String forwardSignature;
    @SerializedName("forward_sender_name")
    private String forwardSenderName;
    @SerializedName("forward_date")
    private Integer forwardDate;
    @SerializedName("is_topic_message")
    private boolean topicMessage;
    @SerializedName("is_automatic_forward")
    private boolean automaticForward;
    @SerializedName("reply_to_message")
    private Message replyToMessage;
    @SerializedName("via_bot")
    private User viaBot;
    @SerializedName("edit_date")
    private Integer editDate;
    @SerializedName("has_protected_content")
    private boolean protectedContent;
    @SerializedName("has_media_spoiler")
    private boolean mediaSpoiler;
    @SerializedName("media_group_id")
    private String mediaGroupId;
    @SerializedName("author_signature")
    private String authorSignature;
    private String text;
    private MessageEntity[] entities;
    @SerializedName("caption_entities")
    private MessageEntity[] captionEntities;
    private Audio audio;
    private Document document;
    private Animation animation;
    private Game game;
    private PhotoSize[] photo;
    private Sticker sticker;
    private Video video;
    private Voice voice;
    @SerializedName("video_note")
    private VideoNote videoNote;
    private String caption;
    private Contact contact;
    private Location location;
    private Venue venue;
    private Poll poll;
    private Dice dice;
    @SerializedName("new_chat_members")
    private User[] newChatMembers;
    @SerializedName("left_chat_member")
    private User leftChatMember;
    @SerializedName("new_chat_title")
    private String newChatTitle;
    @SerializedName("new_chat_photo")
    private PhotoSize[] newChatPhoto;
    @SerializedName("delete_chat_photo")
    private boolean deleteChatPhoto;
    @SerializedName("group_chat_created")
    private boolean groupChatCreated;
    @SerializedName("supergroup_chat_created")
    private boolean supergroupChatCreated;
    @SerializedName("channel_chat_created")
    private boolean channelChatCreated;
    @SerializedName("message_auto_delete_timer_changed")
    private MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;
    @SerializedName("migrate_to_chat_id")
    private Long migrateToChatId;
    @SerializedName("migrate_from_chat_id")
    private Long migrateFromChatId;
    @SerializedName("pinned_message")
    private Message pinnedMessage;
    private Invoice invoice;
    @SerializedName("successful_payment")
    private SuccessfulPayment successfulPayment;
    @SerializedName("user_shared")
    private UserShared userShared;
    @SerializedName("chat_shared")
    private ChatShared chatShared;
    @SerializedName("connected_website")
    private String connectedWebsite;
    @SerializedName("passport_data")
    private PassportData passportData;
    @SerializedName("proximity_alert_triggered")
    private ProximityAlertTriggered proximityAlertTriggered;
    @SerializedName("forum_topic_created")
    private ForumTopicCreated forumTopicCreated;
    @SerializedName("forum_topic_edited")
    private ForumTopicEdited forumTopicEdited;
    @SerializedName("forum_topic_closed")
    private ForumTopicClosed forumTopicClosed;
    @SerializedName("forum_topic_reopened")
    private ForumTopicReopened forumTopicReopened;
    @SerializedName("general_forum_topic_hidden")
    private GeneralForumTopicHidden generalForumTopicHidden;
    @SerializedName("general_forum_topic_unhidden")
    private GeneralForumTopicUnhidden generalForumTopicUnhidden;
    @SerializedName("write_access_allowed")
    private WriteAccessAllowed writeAccessAllowed;
    @SerializedName("video_chat_started")
    private VideoChatStarted videoChatStarted;
    @SerializedName("video_chat_ended")
    private VideoChatEnded videoChatEnded;
    @SerializedName("video_chat_participants_invited")
    private VideoChatParticipantsInvited videoChatParticipantsInvited;
    @SerializedName("video_chat_scheduled")
    private VideoChatScheduled videoChatScheduled;
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
    @SerializedName("web_app_data")
    private WebAppData webAppData;
}