package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class ResidentialAddress extends DecryptedData implements BaseObject {

    @SerializedName("street_line1")
    private String streetLine1;
    @SerializedName("street_line2")
    private String streetLine2;
    private String city;
    private String state;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("post_code")
    private String postCode;
}