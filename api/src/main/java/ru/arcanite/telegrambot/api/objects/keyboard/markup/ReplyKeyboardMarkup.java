package ru.arcanite.telegrambot.api.objects.keyboard.markup;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.keyboard.Keyboard;
import ru.arcanite.telegrambot.api.objects.keyboard.buttons.KeyboardButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class ReplyKeyboardMarkup extends Keyboard {

    private final List<List<KeyboardButton>> keyboard;

    @SerializedName("resize_keyboard")
    private boolean resizeKeyboard;
    @SerializedName("one_time_keyboard")
    private boolean oneTimeKeyboard;
    @SerializedName("input_field_placeholder")
    private String inputFieldPlaceholder;
    private boolean selective;
    @SerializedName("is_persistent")
    private boolean persistent;

    public ReplyKeyboardMarkup(final String[][] keyboard, final boolean resizeKeyboard, final boolean oneTimeKeyboard, final String inputFieldPlaceholder, final boolean selective, final boolean persistent) {
        this.keyboard = new ArrayList<>();
        this.resizeKeyboard = resizeKeyboard;
        this.oneTimeKeyboard = oneTimeKeyboard;
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        this.selective = selective;
        this.persistent = persistent;
        for (final String[] line : keyboard) addRow(line);
    }

    public ReplyKeyboardMarkup(final String[][] keyboard, final boolean resizeKeyboard, final boolean oneTimeKeyboard, final boolean selective, final boolean persistent) {
        this(keyboard, resizeKeyboard, oneTimeKeyboard, null, selective, persistent);
    }

    public ReplyKeyboardMarkup(final String[]... keyboard) {
        this(keyboard, false, false, false, false);
    }

    public ReplyKeyboardMarkup(final KeyboardButton[]... keyboard) {
        this(new String[0][]);
        for (final KeyboardButton[] row : keyboard) addRow(row);
    }

    public ReplyKeyboardMarkup(final String... keyboard) {
        this(new String[][]{keyboard});
    }

    public ReplyKeyboardMarkup(final KeyboardButton... keyboard) {
        this(new KeyboardButton[][]{keyboard});
    }

    public void addRow(final KeyboardButton... buttons) {
        this.keyboard.add(Arrays.asList(buttons));
    }

    public void addRow(final String... buttons) {
        final List<KeyboardButton> newRow = new ArrayList<>();
        for (final String button : buttons) {
            newRow.add(new KeyboardButton(button));
        }
        this.keyboard.add(newRow);
    }

    public ReplyKeyboardMarkup setResizeKeyboard(final boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
        return this;
    }

    public ReplyKeyboardMarkup setOneTimeKeyboard(final boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
        return this;
    }

    public ReplyKeyboardMarkup setInputFieldPlaceholder(final String inputFieldPlaceholder) {
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        return this;
    }

    public ReplyKeyboardMarkup setSelective(final boolean selective) {
        this.selective = selective;
        return this;
    }

    public ReplyKeyboardMarkup setPersistent(final boolean persistent) {
        this.persistent = persistent;
        return this;
    }
}