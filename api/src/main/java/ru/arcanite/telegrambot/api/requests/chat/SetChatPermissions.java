package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.objects.chat.ChatPermissions;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class SetChatPermissions extends BaseRequest<SetChatPermissions, BaseResponse> {

    public SetChatPermissions(final Object chatId, final ChatPermissions permissions) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("permissions", permissions);
    }

    public SetChatPermissions setUseIndependentChatPermissions(final boolean useIndependentChatPermissions) {
        return add("use_independent_chat_permissions", useIndependentChatPermissions);
    }
}