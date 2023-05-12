package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Document implements BaseObject {

    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    private PhotoSize thumbnail;
    @SerializedName("file_name")
    private String fileName;
    @SerializedName("mime_type")
    private String mimeType;
    @SerializedName("file_size")
    private Long fileSize;
}