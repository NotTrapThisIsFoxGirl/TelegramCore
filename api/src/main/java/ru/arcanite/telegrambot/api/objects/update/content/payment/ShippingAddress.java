package ru.arcanite.telegrambot.api.objects.update.content.payment;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class ShippingAddress implements BaseObject {

    @SerializedName("country_code")
    private String countryCode;
    private String state;
    private String city;
    @SerializedName("street_line1")
    private String streetLine1;
    @SerializedName("street_line2")
    private String streetLine2;
    @SerializedName("post_code")
    private String postCode;
}