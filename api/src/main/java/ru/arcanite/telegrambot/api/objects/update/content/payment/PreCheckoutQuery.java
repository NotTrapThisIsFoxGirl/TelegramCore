package ru.arcanite.telegrambot.api.objects.update.content.payment;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.user.User;

@Getter
public class PreCheckoutQuery implements BaseObject {

    private String id;
    private User from;
    private String currency;
    @SerializedName("total_amount")
    private Integer totalAmount;
    @SerializedName("invoice_payload")
    private String invoicePayload;
    @SerializedName("shipping_option_id")
    private String shippingOptionId;
    @SerializedName("order_info")
    private OrderInfo orderInfo;
}