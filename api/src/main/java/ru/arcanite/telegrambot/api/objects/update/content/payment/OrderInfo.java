package ru.arcanite.telegrambot.api.objects.update.content.payment;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class OrderInfo implements BaseObject {

    private String name;
    @SerializedName("phone_number")
    private String phoneNumber;
    private String email;
    @SerializedName("shipping_address")
    private ShippingAddress shippingAddress;
}