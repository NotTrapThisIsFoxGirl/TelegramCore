package ru.arcanite.telegrambot.api.requests.update;

import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResult;
import ru.arcanite.telegrambot.api.objects.update.content.inline.result.InlineQueryResultsButton;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class AnswerInlineQuery extends BaseRequest<AnswerInlineQuery, BaseResponse> {

    public AnswerInlineQuery(final String inlineQueryId, final InlineQueryResult<?>... results) {
        super(BaseResponse.class);
        add("inline_query_id", inlineQueryId);
        add("results", results);
    }

    public AnswerInlineQuery setCacheTime(final int cacheTime) {
        return add("cache_time", cacheTime);
    }

    public AnswerInlineQuery setPersonal(final boolean personal) {
        return add("is_personal", personal);
    }

    public AnswerInlineQuery setNextOffset(final String nextOffset) {
        return add("next_offset", nextOffset);
    }

    public AnswerInlineQuery setButton(final InlineQueryResultsButton button) {
        return add ("button", button);
    }
}