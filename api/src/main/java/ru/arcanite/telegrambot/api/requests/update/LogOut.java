package ru.arcanite.telegrambot.api.requests.update;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class LogOut extends BaseRequest<LogOut, BaseResponse> {

    public LogOut() {
        super(BaseResponse.class);
    }
}