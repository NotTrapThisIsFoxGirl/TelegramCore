package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.requests.BaseSendRequest;

public class SendLocation extends BaseSendRequest<SendLocation> {

    public SendLocation(final Object chatId, final float latitude, final float longitude) {
        super(chatId);
        add("latitude", latitude);
        add("longitude", longitude);
    }

    public SendLocation setHorizontalAccuracy(final float horizontalAccuracy) {
        return add("horizontal_accuracy", horizontalAccuracy);
    }

    public SendLocation setLivePeriod(final int livePeriod) {
        return add("live_period", livePeriod);
    }

    public SendLocation setHeading(final int heading) {
        return add("heading", heading);
    }

    public SendLocation setProximityAlertRadius(final int proximityAlertRadius) {
        return add("proximity_alert_radius", proximityAlertRadius);
    }
}