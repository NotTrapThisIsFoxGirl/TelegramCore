package ru.arcanite.telegrambot.api.requests.update;

import ru.arcanite.telegrambot.api.objects.update.content.payment.ShippingOption;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class AnswerShippingQuery extends BaseRequest<AnswerShippingQuery, BaseResponse> {

    public AnswerShippingQuery(final String shippingQueryId, final ShippingOption... shippingOptions) {
        super(BaseResponse.class);
        add("shipping_query_id", shippingQueryId);
        add("ok", true);
        add("shipping_options", shippingOptions);
    }

    public AnswerShippingQuery(final String shippingQueryId, final String errorMessage) {
        super(BaseResponse.class);
        add("shipping_query_id", shippingQueryId);
        add("ok", false);
        add("error_message", errorMessage);
    }
}