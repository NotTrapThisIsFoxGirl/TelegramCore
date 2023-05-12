package ru.arcanite.telegrambot.api.objects.update.content.inline.result.cached;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;

@Getter
public class InlineQueryResultCachedSticker extends InlineQueryResult<InlineQueryResultCachedSticker> {

    @SerializedName("sticker_file_id")
    private final String stickerFileId;

    public InlineQueryResultCachedSticker(final String id, final String fileId) {
        super("sticker", id);
        this.stickerFileId = fileId;
    }
}