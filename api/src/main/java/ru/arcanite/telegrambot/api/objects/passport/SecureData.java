package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

import java.lang.reflect.Field;

@Getter
public class SecureData implements BaseObject {

    @SerializedName("personal_details")
    private SecureValue personalDetails;
    private SecureValue passport;
    @SerializedName("internal_passport")
    private SecureValue internalPassport;
    @SerializedName("driver_license")
    private SecureValue driverLicense;
    @SerializedName("identify_card")
    private SecureValue identityCard;
    private SecureValue address;
    @SerializedName("utility_bill")
    private SecureValue utilityBill;
    @SerializedName("bank_statement")
    private SecureValue bankStatement;
    @SerializedName("rental_agreement")
    private SecureValue rentalAgreement;
    @SerializedName("passport_registration")
    private SecureValue passportRegistration;
    @SerializedName("temporary_registration")
    private SecureValue temporaryRegistration;

    public SecureValue ofType(final EncryptedPassportElementType type) {
        try {
            final Field field = getClass().getDeclaredField(type.name());
            return (SecureValue) field.get(this);
        } catch (final Exception exception) {
            return null;
        }
    }
}