package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.objects.update.content.payment.LabeledPrice;
import ru.arcanite.telegrambot.api.responses.StringResponse;

public class CreateInvoiceLink extends BaseRequest<CreateInvoiceLink, StringResponse> {

    public CreateInvoiceLink(final String title, final String description, final String payload, final String providerToken, final String currency, final LabeledPrice... prices) {
        super(StringResponse.class);
        add("title", title);
        add("description", description);
        add("payload", payload);
        add("provider_token", providerToken);
        add("currency", currency);
        add("prices", prices);
    }

    public CreateInvoiceLink setMaxTipAmount(final int maxTipAmount) {
        return add("max_tip_amount", maxTipAmount);
    }

    public CreateInvoiceLink setSuggestedTipAmounts(final int[] suggestedTipAmounts) {
        return add("suggested_tip_amounts", suggestedTipAmounts);
    }

    public CreateInvoiceLink setProviderData(final String providerData) {
        return add("provider_data", providerData);
    }

    public CreateInvoiceLink setPhotoUrl(final String photoUrl) {
        return add("photo_url", photoUrl);
    }

    public CreateInvoiceLink setPhotoSize(final int photoSize) {
        return add("photo_size", photoSize);
    }

    public CreateInvoiceLink setPhotoWidth(final int photoWidth) {
        return add("photo_width", photoWidth);
    }

    public CreateInvoiceLink setPhotoHeight(final int photoHeight) {
        return add("photo_height", photoHeight);
    }

    public CreateInvoiceLink setNeedName(final boolean needName) {
        return add("need_name", needName);
    }

    public CreateInvoiceLink setNeedPhoneNumber(final boolean needPhoneNumber) {
        return add("need_phone_number", needPhoneNumber);
    }

    public CreateInvoiceLink setNeedEmail(final boolean needEmail) {
        return add("need_email", needEmail);
    }

    public CreateInvoiceLink setNeedShippingAddress(final boolean needShippingAddress) {
        return add("need_shipping_address", needShippingAddress);
    }

    public CreateInvoiceLink setSendEmailToProvider(final boolean sendEmailToProvider) {
        return add("send_email_to_provider", sendEmailToProvider);
    }

    public CreateInvoiceLink setSendPhoneNumberToProvider(final boolean sendPhoneNumberToProvider) {
        return add("send_phone_number_to_provider", sendPhoneNumberToProvider);
    }

    public CreateInvoiceLink setFlexible(final boolean flexible) {
        return add("is_flexible", flexible);
    }
}