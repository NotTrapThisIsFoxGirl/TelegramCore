package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;
import ru.arcanite.telegrambot.api.objects.update.content.poll.PollType;
import ru.arcanite.telegrambot.api.requests.BaseSendRequest;
import ru.arcanite.telegrambot.api.requests.ParseMode;

public class SendPoll extends BaseSendRequest<SendPoll> {

    public SendPoll(final Object chatId, final String question, final String... options) {
        super(chatId);
        add("question", question);
        add("options", options);
    }

    public SendPoll setAnonymous(final boolean anonymous) {
        return add("is_anonymous", anonymous);
    }

    public SendPoll setType(final String type) {
        return add("type", type);
    }

    public SendPoll setType(final PollType type) {
        return add("type", type.name());
    }

    public SendPoll setAllowsMultipleAnswers(final boolean allowsMultipleAnswers) {
        return add("allows_multiple_answers", allowsMultipleAnswers);
    }

    public SendPoll setCorrectOptionId(final int correctOptionId) {
        return add("correct_option_id", correctOptionId);
    }

    public SendPoll setExplanation(final String explanation) {
        return add("explanation", explanation);
    }

    public SendPoll setExplanationParseMode(final ParseMode parseMode) {
        return add("explanation_parse_mode", parseMode.name());
    }

    public SendPoll setExplanationEntities(final MessageEntity... entities) {
        return add("explanation_entities", entities);
    }

    public SendPoll setOpenPeriod(final int openPeriod) {
        return add("open_period", openPeriod);
    }

    public SendPoll setCloseDate(final long closeDate) {
        return add("close_date", closeDate);
    }

    public SendPoll setClosed(final boolean isClosed) {
        return add("is_closed", isClosed);
    }
}