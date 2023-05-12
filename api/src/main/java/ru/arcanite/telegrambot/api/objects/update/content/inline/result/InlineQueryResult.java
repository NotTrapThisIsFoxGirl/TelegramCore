package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.keyboard.markup.InlineKeyboardMarkup;
import ru.arcanite.telegrambot.api.objects.update.content.inline.content.InputMessageContent;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;

@Getter
public abstract class InlineQueryResult<T extends InlineQueryResult<T>> implements BaseObject {

    @SuppressWarnings("unchecked")
    protected final T instance = (T) this;

    private final String type;
    private final String id;

    @SerializedName("caption_entities")
    private MessageEntity[] captionEntities;
    @SerializedName("input_message_content")
    private InputMessageContent inputMessageContent;
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    public InlineQueryResult(final String type, final String id) {
        this.type = type;
        this.id = id;
    }

    public T setCaptionEntities(final MessageEntity... entities) {
        this.captionEntities = entities;
        return instance;
    }

    public void setInputMessageContent(final InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
    }

    public T setReplyMarkup(final InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return instance;
    }
}