package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.requests.BaseSendRequest;

public class SendDice extends BaseSendRequest<SendDice> {

    public SendDice(final Object chatId) {
        super(chatId);
    }

    public SendDice setEmoji(final String emoji) {
        return add("emoji", emoji);
    }

    public SendDice setDarts() {
        return setEmoji("🎯");
    }

    public SendDice setBasketball() {
        return setEmoji("🏀");
    }

    public SendDice setFootball() {
        return setEmoji("⚽");
    }

    public SendDice setSlotMachine() {
        return setEmoji("🎰");
    }

    public SendDice setBowling() {
        return setEmoji("🎳");
    }
}