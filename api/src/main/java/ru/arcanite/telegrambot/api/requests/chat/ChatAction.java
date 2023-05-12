package ru.arcanite.telegrambot.api.requests.chat;

import com.google.gson.annotations.SerializedName;

public enum ChatAction {

    @SerializedName("find_location") FIND_LOCATION,
    @SerializedName("record_video") RECORD_VIDEO,
    @SerializedName("record_video_note") RECORD_VIDEO_NOTE,
    @SerializedName("record_voice") RECORD_VOICE,
    @SerializedName("typing") TYPING,
    @SerializedName("upload_document") UPLOAD_DOCUMENT,
    @SerializedName("upload_photo") UPLOAD_PHOTO,
    @SerializedName("upload_video") UPLOAD_VIDEO,
    @SerializedName("upload_video_note") UPLOAD_VIDEO_NOTE,
    @SerializedName("upload_voice") UPLOAD_VOICE
}