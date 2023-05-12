package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Venue implements BaseObject {

    private Location location;
    private String title;
    private String address;
    @SerializedName("foursquare_id")
    private String foursquareId;
    @SerializedName("foursquare_type")
    private String foursquareType;
    @SerializedName("google_place_id")
    private String googlePlaceId;
    @SerializedName("google_place_type")
    private String googlePlaceType;
}