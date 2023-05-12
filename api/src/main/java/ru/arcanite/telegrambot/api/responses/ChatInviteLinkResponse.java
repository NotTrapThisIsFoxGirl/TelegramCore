package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.chat.ChatInviteLink;

@Getter
public class ChatInviteLinkResponse extends BaseResponse {

    @SerializedName("result")
    private ChatInviteLink chatInviteLink;
}