package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.chat.member.ChatMember;

@Getter
public class GetChatMemberResponse extends BaseResponse {

    @SerializedName("result")
    private ChatMember chatMember;
}