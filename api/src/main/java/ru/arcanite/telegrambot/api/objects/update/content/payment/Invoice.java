package ru.arcanite.telegrambot.api.objects.update.content.payment;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class Invoice implements BaseObject {

    private String title;
    private String description;
    @SerializedName("start_parameter")
    private String startParameter;
    private String currency;
    @SerializedName("total_amount")
    private Integer totalAmount;
}