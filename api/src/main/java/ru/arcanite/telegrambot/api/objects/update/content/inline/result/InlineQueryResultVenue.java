package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class InlineQueryResultVenue extends InlineQueryResult<InlineQueryResultVenue> {

    private final Float latitude;
    private final Float longitude;
    private final String title;
    private final String address;

    @SerializedName("foursquare_id")
    private String foursquareId;
    @SerializedName("foursquare_type")
    private String foursquareType;
    @SerializedName("google_place_id")
    private String googlePlaceId;
    @SerializedName("google_place_type")
    private String googlePlaceType;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;

    public InlineQueryResultVenue(final String id, final float latitude, final float longitude, final String title, final String address) {
        super("venue", id);
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    public InlineQueryResultVenue setFoursquareId(final String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }

    public InlineQueryResultVenue setFoursquareType(final String foursquareType) {
        this.foursquareType = foursquareType;
        return this;
    }

    public InlineQueryResultVenue setGooglePlaceId(final String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
        return this;
    }

    public InlineQueryResultVenue setGooglePlaceType(final String googlePlaceType) {
        this.googlePlaceType = googlePlaceType;
        return this;
    }

    public InlineQueryResultVenue setThumbnailUrl(final String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    public InlineQueryResultVenue setThumbnailWidth(final int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    public InlineQueryResultVenue setThumbnailHeight(final int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }
}