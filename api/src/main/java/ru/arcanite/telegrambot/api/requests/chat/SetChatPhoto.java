package ru.arcanite.telegrambot.api.requests.chat;

import lombok.Getter;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

import java.io.File;

@Getter
public class SetChatPhoto extends BaseRequest<SetChatPhoto, BaseResponse> {

    private final boolean multipart = true;

    public SetChatPhoto(final Object chatId, final byte[] photo) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("photo", photo);
    }

    public SetChatPhoto(final Object chatId, final File photo) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("photo", photo);
    }
}