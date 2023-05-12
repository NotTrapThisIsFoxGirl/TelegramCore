package ru.arcanite.telegrambot.api.objects.passport;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetPassportDataErrors extends BaseRequest<SetPassportDataErrors, BaseResponse> {

    public SetPassportDataErrors(final long userId, final PassportElementError... errors) {
        super(BaseResponse.class);
        add("user_id", userId);
        add("errors", errors);
    }
}