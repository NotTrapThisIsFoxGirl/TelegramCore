package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class VideoNote implements BaseObject {

    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    private Integer length;
    private Integer duration;
    private PhotoSize thumbnail;
    @SerializedName("file_size")
    private Long fileSize;
}