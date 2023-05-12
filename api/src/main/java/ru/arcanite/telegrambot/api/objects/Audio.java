package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Audio implements BaseObject {

    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    private Integer duration;
    private String performer;
    private String title;
    @SerializedName("file_name")
    private String fileName;
    @SerializedName("mime_type")
    private String mimeType;
    @SerializedName("file_size")
    private Long fileSize;
    private PhotoSize thumbnail;
}