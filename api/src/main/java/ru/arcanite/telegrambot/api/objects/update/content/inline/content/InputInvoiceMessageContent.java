package ru.arcanite.telegrambot.api.objects.update.content.inline.content;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.update.content.payment.LabeledPrice;

@Getter
public class InputInvoiceMessageContent extends InputMessageContent {

    private final String title;
    private final String description;
    private final String payload;
    @SerializedName("provider_token")
    private final String providerToken;
    private final String currency;
    private final LabeledPrice[] prices;

    @SerializedName("max_tip_amount")
    private Integer maxTipAmount;
    @SerializedName("suggested_tip_amount")
    private int[] suggestedTipAmount;
    @SerializedName("provider_data")
    private String providerData;
    @SerializedName("photo_url")
    private String photoUrl;
    @SerializedName("photo_size")
    private Integer photoSize;
    @SerializedName("photo_width")
    private Integer photoWidth;
    @SerializedName("photo_height")
    private Integer photoHeight;
    @SerializedName("need_name")
    private boolean needName;
    @SerializedName("need_phone_number")
    private boolean needPhoneNumber;
    @SerializedName("need_email")
    private boolean needEmail;
    @SerializedName("need_shipping_address")
    private boolean needShippingAddress;
    @SerializedName("send_phone_number_to_provider")
    private boolean sendPhoneNumberToProvider;
    @SerializedName("send_email_to_provider")
    private boolean sendEmailToProvider;
    @SerializedName("is_flexible")
    private boolean flexible;

    public InputInvoiceMessageContent(final String title, final String description, final String payload, final String providerToken, final String currency, final LabeledPrice[] prices) {
        this.title = title;
        this.description = description;
        this.payload = payload;
        this.providerToken = providerToken;
        this.currency = currency;
        this.prices = prices;
    }

    public InputInvoiceMessageContent setMaxTipAmount(final int maxTipAmount) {
        this.maxTipAmount = maxTipAmount;
        return this;
    }

    public InputInvoiceMessageContent setSuggestedTipAmount(final int[] suggestedTipAmount) {
        this.suggestedTipAmount = suggestedTipAmount;
        return this;
    }

    public InputInvoiceMessageContent setProviderData(final String providerData) {
        this.providerData = providerData;
        return this;
    }

    public InputInvoiceMessageContent setPhotoUrl(final String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    public InputInvoiceMessageContent setPhotoSize(final int photoSize) {
        this.photoSize = photoSize;
        return this;
    }

    public InputInvoiceMessageContent setPhotoWidth(final int photoWidth) {
        this.photoWidth = photoWidth;
        return this;
    }

    public InputInvoiceMessageContent setPhotoHeight(final int photoHeight) {
        this.photoHeight = photoHeight;
        return this;
    }

    public InputInvoiceMessageContent setNeedName(final boolean needName) {
        this.needName = needName;
        return this;
    }

    public InputInvoiceMessageContent setNeedPhoneNumber(final boolean needPhoneNumber) {
        this.needPhoneNumber = needPhoneNumber;
        return this;
    }

    public InputInvoiceMessageContent setNeedEmail(final boolean needEmail) {
        this.needEmail = needEmail;
        return this;
    }

    public InputInvoiceMessageContent setNeedShippingAddress(final boolean needShippingAddress) {
        this.needShippingAddress = needShippingAddress;
        return this;
    }

    public InputInvoiceMessageContent setSendPhoneNumberToProvider(final boolean sendPhoneNumberToProvider) {
        this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
        return this;
    }

    public InputInvoiceMessageContent setSendEmailToProvider(final boolean sendEmailToProvider) {
        this.sendEmailToProvider = sendEmailToProvider;
        return this;
    }

    public InputInvoiceMessageContent setFlexible(final boolean flexible) {
        this.flexible = flexible;
        return this;
    }
}