package ru.arcanite.telegrambot.api.objects.update.content.poll;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class PollOption implements BaseObject {

    private String text;
    @SerializedName("voter_count")
    private Integer voterCount;
}