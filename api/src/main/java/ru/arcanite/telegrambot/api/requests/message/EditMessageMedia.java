package ru.arcanite.telegrambot.api.requests.message;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.keyboard.markup.InlineKeyboardMarkup;
import ru.arcanite.telegrambot.api.objects.media.InputMedia;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;
import ru.arcanite.telegrambot.api.responses.SendResponse;

import java.util.Map;

@Getter
public class EditMessageMedia extends BaseRequest<EditMessageMedia, BaseResponse> {

    private boolean multipart;
    private InputMedia<?> media;

    public EditMessageMedia(final Object chatId, final int messageId, final InputMedia<?> media) {
        super(SendResponse.class);
        add("chat_id", chatId);
        add("message_id", messageId);
        addMedia(media);
    }

    public EditMessageMedia(final String inlineMessageId, final InputMedia<?> media) {
        super(BaseResponse.class);
        add("inline_message_id", inlineMessageId);
        addMedia(media);
    }

    private void addMedia(final InputMedia<?> media) {
        this.media = media;
        add("media", media);
        final Map<String, Object> attachments = media.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            addAll(attachments);
            this.multipart = true;
        }
        if (media.getInputFile() != null) {
            add(media.getInputFileId(), media.getInputFile());
            this.multipart = true;
        }
    }

    public EditMessageMedia setReplyMarkup(final InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    @Override
    public String getFileName() {
        return media.getFileName();
    }

    @Override
    public String getContentType() {
        return media.getContentType();
    }
}