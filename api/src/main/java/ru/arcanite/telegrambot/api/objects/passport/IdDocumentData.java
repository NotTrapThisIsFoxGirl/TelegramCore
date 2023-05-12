package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.objects.BaseObject;

@Getter
public class IdDocumentData extends DecryptedData implements BaseObject {

    @SerializedName("document_no")
    private String documentNo;
    @SerializedName("expiry_date")
    private String expiryDate;
}