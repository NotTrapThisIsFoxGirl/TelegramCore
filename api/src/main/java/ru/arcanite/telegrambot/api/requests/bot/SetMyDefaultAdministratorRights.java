package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.objects.chat.ChatAdministratorRights;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetMyDefaultAdministratorRights extends BaseRequest<SetMyDefaultAdministratorRights, BaseResponse> {

    public SetMyDefaultAdministratorRights() {
        super(BaseResponse.class);
    }

    public SetMyDefaultAdministratorRights setRights(final ChatAdministratorRights chatAdministratorRights) {
        return add("rights", chatAdministratorRights);
    }

    public SetMyDefaultAdministratorRights setForChannels(final boolean forChannels) {
        return add("for_channels", forChannels);
    }
}