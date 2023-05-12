package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Location implements BaseObject {

    private Float longitude;
    private Float latitude;
    @SerializedName("horizontal_accuracy")
    private Float horizontalAccuracy;
    @SerializedName("live_period")
    private Integer livePeriod;
    private Integer heading;
    @SerializedName("proximity_alert_radius")
    private Integer proximityAlertRadius;
}