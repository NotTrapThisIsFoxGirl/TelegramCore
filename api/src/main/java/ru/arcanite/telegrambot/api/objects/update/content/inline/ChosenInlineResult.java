package ru.arcanite.telegrambot.api.objects.update.content.inline;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.Location;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class ChosenInlineResult implements BaseObject {

    @SerializedName("result_id")
    private String resultId;
    private User from;
    private Location location;
    @SerializedName("inline_message_id")
    private String inlineMessageId;
    private String query;
}