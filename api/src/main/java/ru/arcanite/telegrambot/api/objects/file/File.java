package ru.arcanite.telegrambot.api.objects.file;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class File implements BaseObject {

    @SerializedName("file_id")
    private String fileId;
    @SerializedName("file_unique_id")
    private String fileUniqueId;
    @SerializedName("file_size")
    private Long fileSize;
    @SerializedName("file_path")
    private String filePath;
}