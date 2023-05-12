package ru.arcanite.telegrambot.api.objects.update.content.inline.content;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class InputLocationMessageContent extends InputMessageContent {

    private final Float latitude;
    private final Float longitude;

    @SerializedName("horizontal_accuracy")
    private Float horizontalAccuracy;
    @SerializedName("live_period")
    private Integer livePeriod;
    private Integer heading;
    @SerializedName("proximity_alert_radius")
    private Integer proximityAlertRadius;

    public InputLocationMessageContent(final float latitude, final float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public InputLocationMessageContent setHorizontalAccuracy(final float horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
        return this;
    }

    public InputLocationMessageContent setLivePeriod(final int livePeriod) {
        this.livePeriod = livePeriod;
        return this;
    }

    public InputLocationMessageContent setHeading(final int heading) {
        this.heading = heading;
        return this;
    }

    public InputLocationMessageContent setProximityAlertRadius(final int proximityAlertRadius) {
        this.proximityAlertRadius = proximityAlertRadius;
        return this;
    }
}