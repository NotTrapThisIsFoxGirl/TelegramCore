package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.objects.update.content.payment.LabeledPrice;
import ru.arcanite.telegrambot.api.requests.BaseSendRequest;

public class SendInvoice extends BaseSendRequest<SendInvoice> {

    public SendInvoice(final long chatId, final String title, final String description, final String payload, final String providerToken, final String currency, final LabeledPrice... prices) {
        super(chatId);
        add("title", title);
        add("description", description);
        add("payload", payload);
        add("provider_token", providerToken);
        add("currency", currency);
        add("prices", prices);
    }

    public SendInvoice(final long chatId, final String title, final String description, final String payload, final String providerToken, final String startParameter, final String currency, final LabeledPrice... prices) {
        this(chatId, title, description, payload, providerToken, currency, prices);
        add("start_parameter", startParameter);
    }

    public SendInvoice setProviderData(final String providerData) {
        return add("provider_data", providerData);
    }

    public SendInvoice setPhotoUrl(final String photoUrl) {
        return add("photo_url", photoUrl);
    }

    public SendInvoice setPhotoSize(final int photoSize) {
        return add("photo_size", photoSize);
    }

    public SendInvoice setPhotoWidth(final int photoWidth) {
        return add("photo_width", photoWidth);
    }

    public SendInvoice setPhotoHeight(final int photoHeight) {
        return add("photo_height", photoHeight);
    }

    public SendInvoice setNeedName(final boolean needName) {
        return add("need_name", needName);
    }

    public SendInvoice setNeedPhoneNumber(final boolean needPhoneNumber) {
        return add("need_phone_number", needPhoneNumber);
    }

    public SendInvoice setNeedEmail(final boolean needEmail) {
        return add("need_email", needEmail);
    }

    public SendInvoice setNeedShippingAddress(final boolean needShippingAddress) {
        return add("need_shipping_address", needShippingAddress);
    }

    public SendInvoice setFlexible(final boolean flexible) {
        return add("is_flexible", flexible);
    }

    public SendInvoice setStartParameter(final String startParameter) {
        return add("start_parameter", startParameter);
    }

    public SendInvoice setMaxTipAmount(final int maxTipAmount) {
        return add("max_tip_amount", maxTipAmount);
    }

    public SendInvoice setSuggestedTipAmounts(final int[] suggestedTipAmounts) {
        return add("suggested_tip_amounts", suggestedTipAmounts);
    }

    public SendInvoice setSendEmailToProvider(final boolean sendEmailToProvider) { return add("send_email_to_provider", sendEmailToProvider); }

    public SendInvoice setSendPhoneNumberToProvider(final boolean sendPhoneNumberToProvider) { return add("send_phone_number_to_provider", sendPhoneNumberToProvider); }
}