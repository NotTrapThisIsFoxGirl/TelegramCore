package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class InlineQueryResultLocation extends InlineQueryResult<InlineQueryResultLocation> {

    private final Float latitude;
    private final Float longitude;
    private final String title;

    @SerializedName("horizontal_accuracy")
    private Float horizontalAccuracy;
    @SerializedName("live_period")
    private Integer livePeriod;
    private Integer heading;
    @SerializedName("proximity_alert_radius")
    private Integer proximityAlertRadius;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;

    public InlineQueryResultLocation(final String id, final float latitude, final float longitude, final String title) {
        super("location", id);
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
    }

    public InlineQueryResultLocation setHorizontalAccuracy(final float horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
        return this;
    }

    public InlineQueryResultLocation setLivePeriod(final int livePeriod) {
        this.livePeriod = livePeriod;
        return this;
    }

    public InlineQueryResultLocation setHeading(final int heading) {
        this.heading = heading;
        return this;
    }

    public InlineQueryResultLocation setProximityAlertRadius(final int proximityAlertRadius) {
        this.proximityAlertRadius = proximityAlertRadius;
        return this;
    }

    public InlineQueryResultLocation setThumbnailUrl(final String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    public InlineQueryResultLocation setThumbnailWidth(final int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    public InlineQueryResultLocation setThumbnailHeight(final int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }
}