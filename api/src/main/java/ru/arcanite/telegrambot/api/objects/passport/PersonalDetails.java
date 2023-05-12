package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class PersonalDetails extends DecryptedData implements BaseObject {

    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("middle_name")
    private String middleName;
    @SerializedName("birth_date")
    private String birthDate;
    private String gender;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("residence_country_code")
    private String residenceCountryCode;
    @SerializedName("first_name_native")
    private String firstNameNative;
    @SerializedName("last_name_native")
    private String lastNameNative;
    @SerializedName("middle_name_native")
    private String middleNameNative;
}