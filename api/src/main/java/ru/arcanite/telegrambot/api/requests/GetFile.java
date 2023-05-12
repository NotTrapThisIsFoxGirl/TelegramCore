package ru.arcanite.telegrambot.api.requests;

import ru.arcanite.telegrambot.api.responses.GetFileResponse;

public class GetFile extends BaseRequest<GetFile, GetFileResponse> {

    public GetFile(final String fileId) {
        super(GetFileResponse.class);
        add("file_id", fileId);
    }
}