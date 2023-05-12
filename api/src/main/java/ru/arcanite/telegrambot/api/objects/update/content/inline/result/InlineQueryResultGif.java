package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultGif extends InlineQueryResult<InlineQueryResultGif> {

    @SerializedName("gif_url")
    private final String gifUrl;
    @SerializedName("thumbnail_url")
    private final String thumbnailUrl;

    @SerializedName("thumbnail_mime_type")
    private String thumbnailMimeType;
    @SerializedName("gif_width")
    private Integer gifWidth;
    @SerializedName("gif_height")
    private Integer gifHeight;
    @SerializedName("gif_duration")
    private Integer gifDuration;
    private String title;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultGif(final String id, final String gifUrl, final String thumbnailUrl) {
        super("gif", id);
        this.gifUrl = gifUrl;
        this.thumbnailUrl = thumbnailUrl;
    }

    public InlineQueryResultGif setGifWidth(final int gifWidth) {
        this.gifWidth = gifWidth;
        return this;
    }

    public InlineQueryResultGif setGifHeight(final int gifHeight) {
        this.gifHeight = gifHeight;
        return this;
    }

    public InlineQueryResultGif setGifDuration(final int gifDuration) {
        this.gifDuration = gifDuration;
        return this;
    }

    public InlineQueryResultGif setThumbnailMimeType(final String thumbnailMimeType) {
        this.thumbnailMimeType = thumbnailMimeType;
        return this;
    }

    public InlineQueryResultGif setTitle(final String title) {
        this.title = title;
        return this;
    }

    public InlineQueryResultGif setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultGif setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}