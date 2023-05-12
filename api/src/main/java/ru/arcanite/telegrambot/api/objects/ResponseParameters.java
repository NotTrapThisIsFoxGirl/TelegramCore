package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ResponseParameters implements BaseObject {

    @SerializedName("migrate_to_chat_id")
    private Long migrateToChatId;
    @SerializedName("retry_after")
    private Integer retryAfter;
}