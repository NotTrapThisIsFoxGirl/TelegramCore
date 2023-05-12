package ru.arcanite.telegrambot.api.objects.update.content.inline.content;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class InputContactMessageContent extends InputMessageContent {

    @SerializedName("phone_number")
    private final String phoneNumber;
    @SerializedName("first_name")
    private final String firstName;

    @SerializedName("last_name")
    private String lastName;
    private String vcard;

    public InputContactMessageContent(final String phoneNumber, final String firstName) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
    }

    public InputContactMessageContent setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public InputContactMessageContent setVcard(final String vcard) {
        this.vcard = vcard;
        return this;
    }
}