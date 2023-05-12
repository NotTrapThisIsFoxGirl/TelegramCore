package ru.arcanite.telegrambot.api.requests.chat;

import ru.arcanite.telegrambot.api.objects.chat.ChatPermissions;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

public class RestrictChatMember extends BaseRequest<RestrictChatMember, BaseResponse> {

    public RestrictChatMember(final Object chatId, final long userId, final ChatPermissions permissions) {
        super(BaseResponse.class);
        add("chat_id", chatId);
        add("user_id", userId);
        add("permissions", permissions);
    }

    public RestrictChatMember setUntilDate(final int untilDate) {
        return add("until_date", untilDate);
    }

    public RestrictChatMember setUseIndependentChatPermissions(final boolean useIndependentChatPermissions) {
        return add("use_independent_chat_permissions", useIndependentChatPermissions);
    }
}