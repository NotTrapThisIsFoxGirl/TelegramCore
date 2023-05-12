package ru.arcanite.telegrambot.api.requests.update;

import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

import java.io.File;

@Getter
public class SetWebhook extends BaseRequest<SetWebhook, BaseResponse> {

    private boolean multipart = false;

    public SetWebhook() {
        super(BaseResponse.class);
    }

    public SetWebhook setUrl(final String url) {
        return add("url", url);
    }

    public SetWebhook setCertificate(final byte[] certificate) {
        this.multipart = true;
        return add("certificate", certificate);
    }

    public SetWebhook setCertificate(final File certificate) {
        this.multipart = true;
        return add("certificate", certificate);
    }

    public SetWebhook setIpAddress(final String ipAddress) {
        return add("ip_address", ipAddress);
    }

    public SetWebhook setMaxConnections(final int maxConnections) {
        return add("max_connections", maxConnections);
    }

    public SetWebhook setAllowedUpdates(final String... allowedUpdates) {
        return add("allowed_updates", allowedUpdates);
    }

    public SetWebhook setDropPendingUpdates(final boolean dropPendingUpdates) {
        return add("drop_pending_updates", dropPendingUpdates);
    }

    public SetWebhook setSecretToken(final String secretToken) {
        return add("secret_token", secretToken);
    }
}