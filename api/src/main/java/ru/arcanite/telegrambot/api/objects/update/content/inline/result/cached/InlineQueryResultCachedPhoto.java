package ru.arcanite.telegrambot.api.objects.update.content.inline.result.cached;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultCachedPhoto extends InlineQueryResult<InlineQueryResultCachedPhoto> {

    @SerializedName("photo_file_id")
    private final String photoFileId;

    private String title;
    private String description;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultCachedPhoto(final String id, final String fileId) {
        super("photo", id);
        this.photoFileId = fileId;
    }

    public InlineQueryResultCachedPhoto setTitle(final String title) {
        this.title = title;
        return this;
    }

    public InlineQueryResultCachedPhoto setDescription(final String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultCachedPhoto setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultCachedPhoto setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}