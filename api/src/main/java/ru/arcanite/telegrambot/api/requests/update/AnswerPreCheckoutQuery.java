package ru.arcanite.telegrambot.api.requests.update;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class AnswerPreCheckoutQuery extends BaseRequest<AnswerPreCheckoutQuery, BaseResponse> {

    public AnswerPreCheckoutQuery(final String preCheckoutQueryId) {
        super(BaseResponse.class);
        add("pre_checkout_query_id", preCheckoutQueryId);
        add("ok", true);
    }

    public AnswerPreCheckoutQuery(final String preCheckoutQueryId, final String errorMessage) {
        super(BaseResponse.class);
        add("pre_checkout_query_id", preCheckoutQueryId);
        add("ok", false);
        add("error_message", errorMessage);
    }
}