package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.chat.member.ChatMember;

import java.util.List;

@Getter
public class GetChatAdministratorsResponse extends BaseResponse {

    @SerializedName("result")
    private List<ChatMember> administrators;
}