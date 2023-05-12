package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultDocument extends InlineQueryResult<InlineQueryResultDocument> {

    public static final String MIME_APP_PDFL = "application/pdf";
    public static final String MIME_APP_ZIP = "application/zip";

    private final String title;
    @SerializedName("document_url")
    private final String documentUrl;
    @SerializedName("mime_type")
    private final String mimeType;

    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;
    private String description;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;

    public InlineQueryResultDocument(final String id, final String documentUrl, final String title, final String mimeType) {
        super("document", id);
        this.documentUrl = documentUrl;
        this.title = title;
        this.mimeType = mimeType;
    }

    public InlineQueryResultDocument setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultDocument setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }

    public InlineQueryResultDocument setDescription(final String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultDocument setThumbnailUrl(final String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    public InlineQueryResultDocument setThumbnailWidth(final int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    public InlineQueryResultDocument setThumbnailHeight(final int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }
}