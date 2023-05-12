package ru.arcanite.telegrambot.api.responses;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.file.File;

@Getter
public class GetFileResponse extends BaseResponse {

    @SerializedName("result")
    private File file;
}