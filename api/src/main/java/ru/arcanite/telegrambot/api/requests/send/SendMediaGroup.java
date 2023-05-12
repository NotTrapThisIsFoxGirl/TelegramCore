package ru.arcanite.telegrambot.api.requests.send;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.media.InputMedia;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.MessagesResponse;

import java.util.Map;

@Getter
public class SendMediaGroup extends BaseRequest<SendMediaGroup, MessagesResponse> {

    private boolean multipart;

    public SendMediaGroup(final Object chatId, final InputMedia<?>... media) {
        super(MessagesResponse.class);
        this.multipart = false;
        add("chat_id", chatId);
        add("media", media);
        for (final InputMedia<?> m : media) {
            final Map<String, Object> attachments = m.getAttachments();
            if (attachments != null && attachments.size() > 0) {
                addAll(attachments);
                this.multipart = true;
            }
            if (m.getInputFile() != null) {
                add(m.getInputFileId(), m.getInputFile());
                this.multipart = true;
            }
        }
    }

    public SendMediaGroup setMessageThreadId(final int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    public SendMediaGroup setDisableNotification(final boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public SendMediaGroup setReplyToMessageId(final int replyToMessageId) {
        return add("reply_to_message_id", replyToMessageId);
    }

    public SendMediaGroup setAllowSendingWithoutReply(final boolean allowSendingWithoutReply) {
        return add("allow_sending_without_reply", allowSendingWithoutReply);
    }
}