package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.content.InputMessageContent;
import ru.arcanite.telegrambot.api.objects.update.content.inline.content.InputTextMessageContent;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultVideo extends InlineQueryResult<InlineQueryResultVideo> {

    public static final String MIME_TEXT_HTML = "text/html";
    public static final String MIME_VIDEO_MP4 = "video/mp4";

    @SerializedName("video_url")
    private final String videoUrl;
    @SerializedName("mime_type")
    private final String mimeType;
    @SerializedName("thumbnail_url")
    private final String thumbnailUrl;
    private final String title;

    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;
    @SerializedName("video_width")
    private Integer videoWidth;
    @SerializedName("video_height")
    private Integer videoHeight;
    @SerializedName("video_duration")
    private Integer videoDuration;
    private String description;

    public InlineQueryResultVideo(final String id, final String videoUrl, final String mimeType, final String messageText, final String thumbUrl, final String title) {
        this(id, videoUrl, mimeType, new InputTextMessageContent(messageText), thumbUrl, title);
    }

    public InlineQueryResultVideo(final String id, final String videoUrl, final String mimeType, final InputMessageContent inputMessageContent, final String thumbnailUrl, final String title) {
        super("video", id);
        this.videoUrl = videoUrl;
        this.mimeType = mimeType;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
        setInputMessageContent(inputMessageContent);
    }

    public InlineQueryResultVideo setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultVideo setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }

    public InlineQueryResultVideo setVideoWidth(final int videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }

    public InlineQueryResultVideo setVideoHeight(final int videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }

    public InlineQueryResultVideo setVideoDuration(final int videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }

    public InlineQueryResultVideo setDescription(final String description) {
        this.description = description;
        return this;
    }
}