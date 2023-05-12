package ru.arcanite.telegrambot.api.objects;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class WebhookInfo implements BaseObject {

    private String url;
    @SerializedName("has_custom_certificate")
    private boolean customCertificate;
    @SerializedName("pending_update_count")
    private Integer pendingUpdateCount;
    @SerializedName("ip_address")
    private String ipAddress;
    @SerializedName("last_error_date")
    private Integer lastErrorDate;
    @SerializedName("last_error_message")
    private String lastErrorMessage;
    @SerializedName("last_synchronization_error_date")
    private Integer lastSynchronizationErrorDate;
    @SerializedName("max_connections")
    private Integer maxConnections;
    @SerializedName("allowed_updates")
    private String[] allowedUpdates;
}