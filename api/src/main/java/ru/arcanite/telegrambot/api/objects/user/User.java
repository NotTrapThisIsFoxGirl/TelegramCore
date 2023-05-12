package ru.arcanite.telegrambot.api.objects.user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class User implements BaseObject {

    private final Long id;
    @SerializedName("is_bot")
    private boolean bot;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    private String username;
    @SerializedName("language_code")
    private String languageCode;
    @SerializedName("is_premium")
    private boolean premium;
    @SerializedName("added_to_attachment_menu")
    private boolean addedToAttachmentMenu;
    @SerializedName("can_join_groups")
    private boolean canJoinGroups;
    @SerializedName("can_read_all_group_messages")
    private boolean canReadAllGroupMessages;
    @SerializedName("supports_inline_queries")
    private boolean supportsInlineQueries;

    public User(final long id) {
        this.id = id;
    }
}