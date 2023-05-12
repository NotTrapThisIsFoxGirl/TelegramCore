package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;

public enum EncryptedPassportElementType {

    @SerializedName("address")
    ADDRESS,
    @SerializedName("bank_statement")
    BANK_STATEMENT,
    @SerializedName("driver_license")
    DRIVER_LICENSE,
    @SerializedName("email")
    EMAIL,
    @SerializedName("identity_card")
    IDENTITY_CARD,
    @SerializedName("internal_passport")
    INTERNAL_PASSPORT,
    @SerializedName("passport")
    PASSPORT,
    @SerializedName("passport_registration")
    PASSPORT_REGISTRATION,
    @SerializedName("personal_details")
    PERSONAL_DETAILS,
    @SerializedName("phone_number")
    PHONE_NUMBER,
    @SerializedName("rental_agreement")
    RENTAL_AGREEMENT,
    @SerializedName("temporary_registration")
    TEMPORARY_REGISTRATION,
    @SerializedName("utility_bill")
    UTILITY_BILL
}