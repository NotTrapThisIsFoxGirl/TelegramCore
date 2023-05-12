package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.requests.BaseSendRequest;

public class SendContact extends BaseSendRequest<SendContact> {

    public SendContact(final Object chatId, final String phoneNumber, final String firstName) {
        super(chatId);
        add("phone_number", phoneNumber);
        add("first_name", firstName);
    }

    public SendContact setLastName(final String lastName) {
        return add("last_name", lastName);
    }

    public SendContact setVcard(final String vcard) {
        return add("vcard", vcard);
    }
}