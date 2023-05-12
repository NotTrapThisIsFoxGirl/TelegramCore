package ru.arcanite.telegrambot.api.objects.update.content.message;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class MessageEntity implements BaseObject {

    private final MessageEntityType type;
    private final Integer offset;
    private final Integer length;

    private String url;
    private User user;
    private String language;
    @SerializedName("custom_emoji_id")
    private String customEmojiId;

    public MessageEntity(final MessageEntityType type, final int offset, final int length) {
        this.type = type;
        this.offset = offset;
        this.length = length;
    }

    public MessageEntity setUrl(final String url) {
        this.url = url;
        return this;
    }

    public MessageEntity setUser(final User user) {
        this.user = user;
        return this;
    }

    public MessageEntity setLanguage(final String language) {
        this.language = language;
        return this;
    }

    public MessageEntity setCustomEmojiId(final String customEmojiId) {
        this.customEmojiId = customEmojiId;
        return this;
    }
}