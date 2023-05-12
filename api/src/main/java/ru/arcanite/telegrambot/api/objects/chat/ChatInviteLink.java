package ru.arcanite.telegrambot.api.objects.chat;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class ChatInviteLink implements BaseObject {

    @SerializedName("invite_link")
    private String inviteLink;
    private User creator;
    @SerializedName("creates_join_request")
    private boolean createsJoinRequest;
    @SerializedName("is_primary")
    private boolean primary;
    @SerializedName("is_revoked")
    private boolean revoked;
    private String name;
    @SerializedName("expire_date")
    private Integer expireDate;
    @SerializedName("member_limit")
    private Integer memberLimit;
    @SerializedName("pending_join_request_count")
    private Integer pendingJoinRequestCount;
}