package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultMpeg4Gif extends InlineQueryResult<InlineQueryResultMpeg4Gif> {

    @SerializedName("mpeg4_url")
    private final String mpeg4Url;
    @SerializedName("thumbnail_url")
    private final String thumbnailUrl;

    @SerializedName("thumbnail_mime_type")
    private String thumbnailMimeType;
    @SerializedName("mpeg4_width")
    private Integer mpeg4Width;
    @SerializedName("mpeg4_height")
    private Integer mpeg4Height;
    @SerializedName("mpeg4_duration")
    private Integer mpeg4Duration;
    private String title;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultMpeg4Gif(final String id, final String mpeg4Url, final String thumbnailUrl) {
        super("mpeg4_gif", id);
        this.mpeg4Url = mpeg4Url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public InlineQueryResultMpeg4Gif setMpeg4Width(final int mpeg4Width) {
        this.mpeg4Width = mpeg4Width;
        return this;
    }

    public InlineQueryResultMpeg4Gif setMpeg4Height(final int mpeg4Height) {
        this.mpeg4Height = mpeg4Height;
        return this;
    }

    public InlineQueryResultMpeg4Gif setMpeg4Duration(final int mpeg4Duration) {
        this.mpeg4Duration = mpeg4Duration;
        return this;
    }

    public InlineQueryResultMpeg4Gif setThumbnailMimeType(final String thumbnailMimeType) {
        this.thumbnailMimeType = thumbnailMimeType;
        return this;
    }

    public InlineQueryResultMpeg4Gif setTitle(final String title) {
        this.title = title;
        return this;
    }

    public InlineQueryResultMpeg4Gif setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultMpeg4Gif setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}