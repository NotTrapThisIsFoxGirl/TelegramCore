package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Voice implements BaseObject {

    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    private Integer duration;
    @SerializedName("mime_type")
    private String mimeType;
    @SerializedName("file_size")
    private Long fileSize;
}