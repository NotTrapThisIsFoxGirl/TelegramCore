package ru.arcanite.telegrambot.api.requests.update;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class DeleteWebhook extends BaseRequest<DeleteWebhook, BaseResponse> {

    public DeleteWebhook() {
        super(BaseResponse.class);
    }

    public DeleteWebhook setDropPendingUpdates(final boolean dropPendingUpdates) {
        return add("drop_pending_updates", dropPendingUpdates);
    }
}