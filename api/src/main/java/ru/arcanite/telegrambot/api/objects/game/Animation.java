package ru.arcanite.telegrambot.api.objects.game;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.PhotoSize;

@Getter
public class Animation implements BaseObject {

    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    private Integer width;
    private Integer height;
    private Integer duration;
    private PhotoSize thumbnail;
    @SerializedName("file_name")
    private String fileName;
    @SerializedName("mime_type")
    private String mimeType;
    @SerializedName("file_size")
    private Long fileSize;
}