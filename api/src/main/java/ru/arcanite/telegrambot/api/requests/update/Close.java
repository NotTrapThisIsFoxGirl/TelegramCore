package ru.arcanite.telegrambot.api.requests.update;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class Close extends BaseRequest<Close, BaseResponse> {

    public Close() {
        super(BaseResponse.class);
    }
}