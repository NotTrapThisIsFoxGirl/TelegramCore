package ru.arcanite.telegrambot.api.objects.update.content.poll;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;
import ru.arcanite.telegrambot.api.objects.update.content.message.MessageEntity;

@Getter
public class Poll implements BaseObject {

    private String id;
    private String question;
    private PollOption[] options;
    @SerializedName("total_voter_count")
    private Integer totalVoterCount;
    @SerializedName("is_closed")
    private boolean closed;
    @SerializedName("is_anonymous")
    private boolean anonymous;
    private PollType type;
    @SerializedName("allows_multiple_answers")
    private boolean allowsMultipleAnswers;
    @SerializedName("correct_option_id")
    private Integer correctOptionId;
    private String explanation;
    @SerializedName("explanation_entities")
    private MessageEntity[] explanationEntities;
    @SerializedName("open_period")
    private Integer openPeriod;
    @SerializedName("close_date")
    private Integer closeDate;
}