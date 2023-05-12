package ru.arcanite.telegrambot.api.objects.update.content.inline.result.cached;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultCachedVoice extends InlineQueryResult<InlineQueryResultCachedVoice> {

    @SerializedName("voice_file_id")
    private final String voiceFileId;
    private final String title;

    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultCachedVoice(final String id, final String fileId, final String title) {
        super("voice", id);
        this.voiceFileId = fileId;
        this.title = title;
    }

    public InlineQueryResultCachedVoice setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultCachedVoice setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}