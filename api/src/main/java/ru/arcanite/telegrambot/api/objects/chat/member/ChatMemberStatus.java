package ru.arcanite.telegrambot.api.objects.chat.member;

import com.google.gson.annotations.SerializedName;

public enum ChatMemberStatus {

    @SerializedName("administrator") ADMINISTRATOR,
    @SerializedName("creator") CREATOR,
    @SerializedName("kicked") KICKED,
    @SerializedName("left") LEFT,
    @SerializedName("member") MEMBER,
    @SerializedName("restricted") RESTRICTED
}