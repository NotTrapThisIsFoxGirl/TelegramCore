package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultPhoto extends InlineQueryResult<InlineQueryResultPhoto> {

    @SerializedName("photo_url")
    private final String photoUrl;
    @SerializedName("thumbnail_url")
    private final String thumbnailUrl;

    @SerializedName("photo_width")
    private Integer photoWidth;
    @SerializedName("photo_height")
    private Integer photoHeight;
    private String title;
    private String description;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultPhoto(final String id, final String photoUrl, final String thumbnailUrl) {
        super("photo", id);
        this.photoUrl = photoUrl;
        this.thumbnailUrl = thumbnailUrl;
    }

    public InlineQueryResultPhoto setPhotoWidth(final int photoWidth) {
        this.photoWidth = photoWidth;
        return this;
    }

    public InlineQueryResultPhoto setPhotoHeight(final int photoHeight) {
        this.photoHeight = photoHeight;
        return this;
    }

    public InlineQueryResultPhoto setTitle(final String title) {
        this.title = title;
        return this;
    }

    public InlineQueryResultPhoto setDescription(final String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultPhoto setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultPhoto setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}