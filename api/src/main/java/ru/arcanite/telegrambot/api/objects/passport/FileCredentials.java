package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class FileCredentials implements BaseObject {

    @SerializedName("file_hash")
    private String fileHash;
    private String secret;
}