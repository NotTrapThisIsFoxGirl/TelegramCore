package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.forum.ForumTopic;

@Getter
public class CreateForumTopicResponse extends BaseResponse {

    @SerializedName("result")
    private ForumTopic forumTopic;
}