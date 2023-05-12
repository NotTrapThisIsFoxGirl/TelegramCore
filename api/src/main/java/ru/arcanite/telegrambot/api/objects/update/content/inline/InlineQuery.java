package ru.arcanite.telegrambot.api.objects.update.content.inline;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.Location;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class InlineQuery implements BaseObject {

    private String id;
    private User from;
    private Location location;
    private String query;
    private String offset;
    @SerializedName("chat_type")
    private String chatType;
}