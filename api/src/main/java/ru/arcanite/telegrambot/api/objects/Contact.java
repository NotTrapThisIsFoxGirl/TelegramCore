package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Contact implements BaseObject {

    @SerializedName("phone_number")
    private String phoneNumber;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("user_id")
    private Long userId;
    private String vcard;
}