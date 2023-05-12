package ru.arcanite.telegrambot.api.objects.keyboard.reply;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.keyboard.Keyboard;

@Getter
public class ForceReplyKeyboard extends Keyboard {

    @SerializedName("force_reply")
    private final boolean forceReply = true;

    @SerializedName("input_field_placeholder")
    private String inputFieldPlaceholder;
    private boolean selective;

    public ForceReplyKeyboard() {
        this(false);
    }

    public ForceReplyKeyboard(final boolean selective) {
        this.selective = selective;
    }

    public ForceReplyKeyboard setInputFieldPlaceholder(final String inputFieldPlaceholder) {
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        return this;
    }

    public ForceReplyKeyboard setSelective(final boolean selective) {
        this.selective = selective;
        return this;
    }
}