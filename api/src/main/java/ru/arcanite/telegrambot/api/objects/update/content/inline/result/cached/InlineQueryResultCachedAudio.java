package ru.arcanite.telegrambot.api.objects.update.content.inline.result.cached;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultCachedAudio extends InlineQueryResult<InlineQueryResultCachedAudio> {

    @SerializedName("audio_file_id")
    private final String audioFileId;

    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultCachedAudio(final String id, final String fileId) {
        super("audio", id);
        this.audioFileId = fileId;
    }

    public InlineQueryResultCachedAudio setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultCachedAudio setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}