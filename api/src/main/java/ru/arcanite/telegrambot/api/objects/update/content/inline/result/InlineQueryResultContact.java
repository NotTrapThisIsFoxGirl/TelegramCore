package ru.arcanite.telegrambot.api.objects.update.content.inline.result;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class InlineQueryResultContact extends InlineQueryResult<InlineQueryResultContact> {

    @SerializedName("phone_number")
    private final String phoneNumber;
    @SerializedName("first_name")
    private final String firstName;

    @SerializedName("last_name")
    private String lastName;
    private String vcard;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;

    public InlineQueryResultContact(final String id, final String phoneNumber, final String firstName) {
        super("contact", id);
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
    }

    public InlineQueryResultContact setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public InlineQueryResultContact setVcard(final String vcard) {
        this.vcard = vcard;
        return this;
    }

    public InlineQueryResultContact setThumbnailUrl(final String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    public InlineQueryResultContact setThumbnailWidth(final int thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    public InlineQueryResultContact setThumbnailHeight(final int thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }
}