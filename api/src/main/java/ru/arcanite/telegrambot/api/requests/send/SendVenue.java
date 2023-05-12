package ru.arcanite.telegrambot.api.requests.send;

import ru.arcanite.telegrambot.api.requests.BaseSendRequest;

public class SendVenue extends BaseSendRequest<SendVenue> {

    public SendVenue(final Object chatId, final float latitude, final float longitude, final String title, final String address) {
        super(chatId);
        add("latitude", latitude);
        add("longitude", longitude);
        add("title", title);
        add("address", address);
    }

    public SendVenue setFoursquareId(final String foursquareId) {
        return add("foursquare_id", foursquareId);
    }

    public SendVenue setFoursquareType(final String foursquareType) {
        return add("foursquare_type", foursquareType);
    }

    public SendVenue setGooglePlaceId(final String googlePlaceId) {
        return add("google_place_id", googlePlaceId);
    }

    public SendVenue setGooglePlaceType(final String googlePlaceType) {
        return add("google_place_type", googlePlaceType);
    }
}