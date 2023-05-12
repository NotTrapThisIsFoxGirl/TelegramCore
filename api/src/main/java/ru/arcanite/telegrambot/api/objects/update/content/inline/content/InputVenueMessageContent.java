package ru.arcanite.telegrambot.api.objects.update.content.inline.content;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class InputVenueMessageContent extends InputMessageContent {

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

    public InputVenueMessageContent(final float latitude, final float longitude, final String title, final String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    public InputVenueMessageContent setFoursquareId(final String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }

    public InputVenueMessageContent setFoursquareType(final String foursquareType) {
        this.foursquareType = foursquareType;
        return this;
    }

    public InputVenueMessageContent setGooglePlaceId(final String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
        return this;
    }

    public InputVenueMessageContent setGooglePlaceType(final String googlePlaceType) {
        this.googlePlaceType = googlePlaceType;
        return this;
    }
}