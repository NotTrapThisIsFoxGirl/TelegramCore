package ru.arcanite.telegrambot.api.objects.update.content.payment;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class ShippingQuery implements BaseObject {

    private String id;
    private User from;
    @SerializedName("invoice_payload")
    private String invoicePayload;
    @SerializedName("shipping_address")
    private ShippingAddress shippingAddress;
}