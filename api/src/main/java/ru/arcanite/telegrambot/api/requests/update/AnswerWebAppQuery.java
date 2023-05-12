package ru.arcanite.telegrambot.api.requests.update;

import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.SentWebAppMessageResponse;

public class AnswerWebAppQuery extends BaseRequest<AnswerWebAppQuery, SentWebAppMessageResponse> {

    public AnswerWebAppQuery(final String webAppQueryId, final InlineQueryResult<?> result) {
        super(SentWebAppMessageResponse.class);
        add("web_app_query_id", webAppQueryId);
        add("result", result);
    }
}