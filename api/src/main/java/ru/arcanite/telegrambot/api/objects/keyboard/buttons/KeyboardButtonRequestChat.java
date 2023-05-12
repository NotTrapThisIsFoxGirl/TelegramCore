package ru.arcanite.telegrambot.api.objects.keyboard.buttons;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.chat.ChatAdministratorRights;

@Getter
public class KeyboardButtonRequestChat implements BaseObject {

    @SerializedName("request_id")
    private final Integer requestId;
    @SerializedName("chat_is_channel")
    private final boolean chatIsChannel;

    @SerializedName("chat_is_forum")
    private boolean chatIsForum;
    @SerializedName("chat_has_username")
    private boolean chatHasUsername;
    @SerializedName("chat_is_created")
    private boolean chatIsCreated;
    @SerializedName("user_administrator_rights")
    private ChatAdministratorRights userAdministratorRights;
    @SerializedName("bot_administrator_rights")
    private ChatAdministratorRights botAdministratorRights;
    @SerializedName("bot_is_member")
    private boolean botIsMember;

    public KeyboardButtonRequestChat(final int requestId, final boolean chatIsChannel) {
        this.requestId = requestId;
        this.chatIsChannel = chatIsChannel;
    }

    public KeyboardButtonRequestChat setChatIsForum(final boolean chatIsForum) {
        this.chatIsForum = chatIsForum;
        return this;
    }

    public KeyboardButtonRequestChat setChatHasUsername(final boolean chatHasUsername) {
        this.chatHasUsername = chatHasUsername;
        return this;
    }

    public KeyboardButtonRequestChat setChatIsCreated(final boolean chatIsCreated) {
        this.chatIsCreated = chatIsCreated;
        return this;
    }

    public KeyboardButtonRequestChat setUserAdministratorRights(final ChatAdministratorRights userAdministratorRights) {
        this.userAdministratorRights = userAdministratorRights;
        return this;
    }

    public KeyboardButtonRequestChat setBotAdministratorRights(final ChatAdministratorRights botAdministratorRights) {
        this.botAdministratorRights = botAdministratorRights;
        return this;
    }

    public KeyboardButtonRequestChat setBotIsMember(final boolean botIsMember) {
        this.botIsMember = botIsMember;
        return this;
    }
}