package ru.arcanite.telegrambot.api.requests.update;

import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetUpdatesResponse;

@Getter
public class GetUpdates extends BaseRequest<GetUpdates, GetUpdatesResponse> {

    private Integer timeout = 0;
    private Integer limit = 100;

    public GetUpdates() {
        super(GetUpdatesResponse.class);
    }

    public GetUpdates setOffset(final int offset) {
        return add("offset", offset);
    }

    public GetUpdates setLimit(final int limit) {
        this.limit = limit;
        return add("limit", limit);
    }

    public GetUpdates setTimeout(final int timeout) {
        this.timeout = timeout;
        return add("timeout", timeout);
    }

    public GetUpdates setAllowedUpdates(final String... allowedUpdates) {
        return add("allowed_updates", allowedUpdates);
    }
}