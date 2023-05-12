package ru.arcanite.telegrambot.api.objects.update;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.chat.ChatJoinRequest;
import ru.arcanite.telegrambot.api.objects.chat.member.ChatMemberUpdated;
import ru.arcanite.telegrambot.api.objects.update.content.CallbackQuery;
import ru.arcanite.telegrambot.api.objects.update.content.inline.ChosenInlineResult;
import ru.arcanite.telegrambot.api.objects.update.content.inline.InlineQuery;
import ru.arcanite.telegrambot.api.objects.update.content.message.Message;
import ru.arcanite.telegrambot.api.objects.update.content.payment.PreCheckoutQuery;
import ru.arcanite.telegrambot.api.objects.update.content.payment.ShippingQuery;
import ru.arcanite.telegrambot.api.objects.update.content.poll.Poll;
import ru.arcanite.telegrambot.api.objects.update.content.poll.PollAnswer;

@Getter
public class Update implements BaseObject {

    @SerializedName("update_id")
    private Integer id;
    private Message message;
    @SerializedName("edited_message")
    private Message editedMessage;
    @SerializedName("channel_post")
    private Message channelPost;
    @SerializedName("edited_channel_post")
    private Message editedChannelPost;
    @SerializedName("inline_query")
    private InlineQuery inlineQuery;
    @SerializedName("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;
    @SerializedName("callback_query")
    private CallbackQuery callbackQuery;
    @SerializedName("shipping_query")
    private ShippingQuery shippingQuery;
    @SerializedName("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery;
    private Poll poll;
    @SerializedName("poll_answer")
    private PollAnswer pollAnswer;
    @SerializedName("my_chat_member")
    private ChatMemberUpdated myChatMember;
    @SerializedName("chat_member")
    private ChatMemberUpdated chatMember;
    @SerializedName("chat_join_request")
    private ChatJoinRequest chatJoinRequest;

    public UpdateType getType() {
        return message != null ? UpdateType.MESSAGE
                : editedMessage != null ? UpdateType.EDITED_MESSAGE
                : channelPost != null ? UpdateType.CHANNEL_POST
                : editedChannelPost != null ? UpdateType.EDITED_CHANNEL_POST
                : callbackQuery != null ? UpdateType.CALLBACK_QUERY
                : inlineQuery != null ? UpdateType.INLINE_QUERY
                : shippingQuery != null ? UpdateType.SHIPPING_QUERY
                : preCheckoutQuery != null ? UpdateType.PRE_CHECKOUT_QUERY
                : chosenInlineResult != null ? UpdateType.CHOSEN_INLINE_RESULT
                : poll != null ? UpdateType.POLL
                : pollAnswer != null ? UpdateType.POLL_ANSWER
                : myChatMember != null ? UpdateType.MY_CHAT_MEMBER
                : chatMember != null ? UpdateType.CHAT_MEMBER
                : chatJoinRequest != null ? UpdateType.CHAT_JOIN_REQUEST
                : UpdateType.UNKNOWN;
    }
}