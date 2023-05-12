package ru.arcanite.telegrambot.api.objects.user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.PhotoSize;

@Getter
public class UserProfilePhotos implements BaseObject {

    @SerializedName("total_count")
    private Integer totalCount;
    private PhotoSize[][] photos;
}