package ru.arcanite.telegrambot.api.objects.update.content.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
@AllArgsConstructor
public class LabeledPrice implements BaseObject {

    private final String label;
    private final Integer amount;
}