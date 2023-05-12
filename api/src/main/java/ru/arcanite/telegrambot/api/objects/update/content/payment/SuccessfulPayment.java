package ru.arcanite.telegrambot.api.objects.update.content.payment;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class SuccessfulPayment implements BaseObject {

    private String currency;
    @SerializedName("total_amount")
    private Integer totalAmount;
    @SerializedName("invoice_payload")
    private String invoicePayload;
    @SerializedName("shipping_option_id")
    private String shippingOptionId;
    @SerializedName("order_info")
    private OrderInfo orderInfo;
    @SerializedName("telegram_payment_charge_id")
    private String telegramPaymentChargeId;
    @SerializedName("provider_payment_charge_id")
    private String providerPaymentChargeId;
}