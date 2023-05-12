package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.content.InputMessageContent;
import ru.arcanite.telegrambot.api.objects.update.content.inline.content.InputTextMessageContent;

@Getter
public class InlineQueryResultArticle extends InlineQueryResult<InlineQueryResultArticle> {

    private final String title;

    private String url;
    @SerializedName("hide_url")
    private boolean hideUrl;
    private String description;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;

    public InlineQueryResultArticle(final String id, final String title, final String messageText) {
        this(id, title, new InputTextMessageContent(messageText));
    }

    public InlineQueryResultArticle(final String id, final String title, final InputMessageContent inputMessageContent) {
        super("article", id);
        this.title = title;
        setInputMessageContent(inputMessageContent);
    }

    public InlineQueryResultArticle setUrl(final String url) {
        this.url = url;
        return this;
    }

    public InlineQueryResultArticle setHideUrl(final boolean hideUrl) {
        this.hideUrl = hideUrl;
        return this;
    }

    public InlineQueryResultArticle setDescription(final String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultArticle setThumbnailUrl(final String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    public InlineQueryResultArticle setThumbnailWidth(final int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    public InlineQueryResultArticle setThumbnailHeight(final int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }
}