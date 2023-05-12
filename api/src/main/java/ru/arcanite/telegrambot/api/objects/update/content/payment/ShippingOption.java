package ru.arcanite.telegrambot.api.objects.update.content.payment;

import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class ShippingOption implements BaseObject {

    private final String id;
    private final String title;
    private final LabeledPrice[] prices;

    public ShippingOption(final String id, final String title, final LabeledPrice... prices) {
        this.id = id;
        this.title = title;
        this.prices = prices;
    }
}