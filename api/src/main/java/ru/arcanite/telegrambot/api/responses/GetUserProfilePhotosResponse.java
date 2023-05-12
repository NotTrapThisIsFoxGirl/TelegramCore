package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.user.UserProfilePhotos;

@Getter
public class GetUserProfilePhotosResponse extends BaseResponse {

    @SerializedName("result")
    private UserProfilePhotos photos;
}