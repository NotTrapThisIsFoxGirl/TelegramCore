package ru.arcanite.telegrambot.api.objects.update.content.inline.result.cached;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultCachedGif extends InlineQueryResult<InlineQueryResultCachedGif> {

    @SerializedName("gif_file_id")
    private final String gifFileId;

    private String title;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultCachedGif(final String id, final String fileId) {
        super("gif", id);
        this.gifFileId = fileId;
    }

    public InlineQueryResultCachedGif setTitle(final String title) {
        this.title = title;
        return this;
    }

    public InlineQueryResultCachedGif setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultCachedGif setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}