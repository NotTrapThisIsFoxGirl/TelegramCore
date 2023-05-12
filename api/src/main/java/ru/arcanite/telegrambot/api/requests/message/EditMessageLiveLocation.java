package ru.arcanite.telegrambot.api.requests.message;

import ru.arcanite.telegrambot.api.objects.keyboard.markup.InlineKeyboardMarkup;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;
import ru.arcanite.telegrambot.api.responses.SendResponse;

public class EditMessageLiveLocation extends BaseRequest<EditMessageLiveLocation, BaseResponse> {

    public EditMessageLiveLocation(final Object chatId, final int messageId, final float latitude, final float longitude) {
        super(SendResponse.class);
        add("chat_id", chatId);
        add("message_id", messageId);
        add("latitude", latitude);
        add("longitude", longitude);
    }

    public EditMessageLiveLocation(final String inlineMessageId, final float latitude, final float longitude) {
        super(BaseResponse.class);
        add("inline_message_id", inlineMessageId);
        add("latitude", latitude);
        add("longitude", longitude);
    }

    public EditMessageLiveLocation setHorizontalAccuracy(final float horizontalAccuracy) {
        return add("horizontal_accuracy", horizontalAccuracy);
    }

    public EditMessageLiveLocation setHeading(final int heading) {
        return add("heading", heading);
    }

    public EditMessageLiveLocation setProximityAlertRadius(final int proximityAlertRadius) {
        return add("proximity_alert_radius", proximityAlertRadius);
    }

    public EditMessageLiveLocation setReplyMarkup(final InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}