package ru.arcanite.telegrambot.api.objects.update.content.inline.result.cached;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultCachedMpeg4Gif extends InlineQueryResult<InlineQueryResultCachedMpeg4Gif> {

    @SerializedName("mpeg4_file_id")
    private final String mpeg4FileId;

    private String title;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultCachedMpeg4Gif(final String id, final String fileId) {
        super("mpeg4_gif", id);
        this.mpeg4FileId = fileId;
    }

    public InlineQueryResultCachedMpeg4Gif setTitle(final String title) {
        this.title = title;
        return this;
    }

    public InlineQueryResultCachedMpeg4Gif setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultCachedMpeg4Gif setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}