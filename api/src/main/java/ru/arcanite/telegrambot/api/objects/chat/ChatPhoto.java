package ru.arcanite.telegrambot.api.objects.chat;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class ChatPhoto implements BaseObject {

    @SerializedName("small_file_id")
    private String smallFileId;
    @SerializedName("small_file_unique_id")
    private String smallFileUniqueId;
    @SerializedName("big_file_id")
    private String bigFileId;
    @SerializedName("big_file_unique_id")
    private String bigFileUniqueId;
}