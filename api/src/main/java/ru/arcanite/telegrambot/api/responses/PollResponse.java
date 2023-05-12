package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.poll.Poll;

@Getter
public class PollResponse extends BaseResponse {

    @SerializedName("result")
    private Poll poll;
}