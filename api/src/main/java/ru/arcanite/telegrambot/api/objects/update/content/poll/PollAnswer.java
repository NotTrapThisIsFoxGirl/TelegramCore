package ru.arcanite.telegrambot.api.objects.update.content.poll;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class PollAnswer implements BaseObject {

    @SerializedName("poll_id")
    private String pollId;
    private User user;
    @SerializedName("option_ids")
    private Integer[] optionIds;
}