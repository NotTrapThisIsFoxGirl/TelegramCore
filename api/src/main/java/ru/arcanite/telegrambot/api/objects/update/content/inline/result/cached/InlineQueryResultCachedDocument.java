package ru.arcanite.telegrambot.api.objects.update.content.inline.result.cached;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;
import ru.arcanite.telegrambot.api.requests.ParseMode;

@Getter
public class InlineQueryResultCachedDocument extends InlineQueryResult<InlineQueryResultCachedDocument> {

    @SerializedName("document_file_id")
    private final String documentFileId;
    private final String title;

    private String description;
    private String caption;
    @SerializedName("parse_mode")
    private String parseMode;

    public InlineQueryResultCachedDocument(final String id, final String fileId, final String title) {
        super("document", id);
        this.documentFileId = fileId;
        this.title = title;
    }

    public InlineQueryResultCachedDocument setDescription(final String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultCachedDocument setCaption(final String caption) {
        this.caption = caption;
        return this;
    }

    public InlineQueryResultCachedDocument setParseMode(final ParseMode parseMode) {
        this.parseMode = parseMode.name();
        return this;
    }
}