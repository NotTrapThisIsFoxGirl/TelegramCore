package ru.arcanite.telegrambot.api.requests.update;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class AnswerCallbackQuery extends BaseRequest<AnswerCallbackQuery, BaseResponse> {

    public AnswerCallbackQuery(final String callbackQueryId) {
        super(BaseResponse.class);
        add("callback_query_id", callbackQueryId);
    }

    public AnswerCallbackQuery setText(final String text) {
        return add("text", text);
    }

    public AnswerCallbackQuery setShowAlert(final boolean showAlert) {
        return add("show_alert", showAlert);
    }

    public AnswerCallbackQuery setUrl(final String url) {
        return add("url", url);
    }

    public AnswerCallbackQuery setCacheTime(final int cacheTime) {
        return add("cache_time", cacheTime);
    }
}