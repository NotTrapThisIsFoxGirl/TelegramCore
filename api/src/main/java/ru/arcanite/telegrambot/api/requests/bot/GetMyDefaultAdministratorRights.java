package ru.arcanite.telegrambot.api.requests.bot;

import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.GetMyDefaultAdministratorRightsResponse;

public class GetMyDefaultAdministratorRights extends BaseRequest<GetMyDefaultAdministratorRights, GetMyDefaultAdministratorRightsResponse> {

    public GetMyDefaultAdministratorRights() {
        super(GetMyDefaultAdministratorRightsResponse.class);
    }

    public GetMyDefaultAdministratorRights setForChannels(final boolean forChannels) {
        return add("for_channels", forChannels);
    }
}