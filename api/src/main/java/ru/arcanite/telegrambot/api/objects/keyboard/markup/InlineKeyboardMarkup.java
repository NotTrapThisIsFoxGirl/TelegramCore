package ru.arcanite.telegrambot.api.objects.keyboard.markup;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.keyboard.Keyboard;
import ru.arcanite.telegrambot.api.objects.keyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class InlineKeyboardMarkup extends Keyboard {

    @SerializedName("inline_keyboard")
    private final List<List<InlineKeyboardButton>> inlineKeyboard;

    public InlineKeyboardMarkup() {
        this.inlineKeyboard = new ArrayList<>();
    }

    public InlineKeyboardMarkup(final InlineKeyboardButton[]... keyboard) {
        this();
        for (final InlineKeyboardButton[] row : keyboard) addRow(row);
    }

    public InlineKeyboardMarkup(final InlineKeyboardButton... keyboard) {
        this(new InlineKeyboardButton[][]{keyboard});
    }

    public void addRow(final InlineKeyboardButton... keyboard) {
        this.inlineKeyboard.add(Arrays.asList(keyboard));
    }

    public InlineKeyboardButton[][] getInlineKeyboard() {
        final InlineKeyboardButton[][] result = new InlineKeyboardButton[inlineKeyboard.size()][];
        for (int i = 0; i < inlineKeyboard.size(); i++) {
            final List<InlineKeyboardButton> line = inlineKeyboard.get(i);
            result[i] = line.toArray(new InlineKeyboardButton[]{});
        }
        return result;
    }
}