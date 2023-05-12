package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultAudio extends InlineQueryResult<InlineQueryResultAudio> {

    @SerializedName("audio_url")
    private final String audioUrl;
    private final String title;

    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;
    private String performer;
    @SerializedName("audio_duration")
    private Integer audioDuration;

    public InlineQueryResultAudio(final String id, final String audioUrl, final String title) {
        super("audio", id);
        this.audioUrl = audioUrl;
        this.title = title;
    }

    public InlineQueryResultAudio setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultAudio setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }

    public InlineQueryResultAudio setPerformer(final String performer) {
        this.performer = performer;
        return this;
    }

    public InlineQueryResultAudio setAudioDuration(final int audioDuration) {
        this.audioDuration = audioDuration;
        return this;
    }
}