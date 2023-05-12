package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultVoice extends InlineQueryResult<InlineQueryResultVoice> {

    @SerializedName("voice_url")
    private final String voiceUrl;
    private final String title;

    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;
    @SerializedName("voice_duration")
    private Integer voiceDuration;

    public InlineQueryResultVoice(final String id, final String voiceUrl, final String title) {
        super("voice", id);
        this.voiceUrl = voiceUrl;
        this.title = title;
    }

    public InlineQueryResultVoice setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultVoice setVoiceDuration(final int voiceDuration) {
        this.voiceDuration = voiceDuration;
        return this;
    }

    public InlineQueryResultVoice setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}