package ru.arcanite.telegrambot.api.objects.update.content.inline.result.cached;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultCachedVideo extends InlineQueryResult<InlineQueryResultCachedVideo> {

    @SerializedName("video_file_id")
    private final String videoFileId;
    private final String title;

    private String description;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultCachedVideo(final String id, final String fileId, final String title) {
        super("video", id);
        this.videoFileId = fileId;
        this.title = title;
    }

    public InlineQueryResultCachedVideo setDescription(final String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultCachedVideo setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultCachedVideo setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}