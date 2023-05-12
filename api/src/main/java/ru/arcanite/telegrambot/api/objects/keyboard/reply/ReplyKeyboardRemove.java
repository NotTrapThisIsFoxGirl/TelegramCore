package ru.arcanite.telegrambot.api.objects.keyboard.reply;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.keyboard.Keyboard;

@Getter
@AllArgsConstructor
public class ReplyKeyboardRemove extends Keyboard {

    @SerializedName("remove_keyboard")
    private final boolean removeKeyboard = true;
    private final boolean selective;

    public ReplyKeyboardRemove() {
        this(false);
    }
}