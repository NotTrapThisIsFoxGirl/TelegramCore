package ru.arcanite.telegrambot.api.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ContentType {

    AUDIO("file.mp3", "audio/mpeg"),
    DOC("file.txt", "text/plain"),
    GENERAL("file.txt", "application/x-www-form-urlencoded"),
    GIF("file.gif", "image/gif"),
    PHOTO("file.jpg", "image/jpeg"),
    VIDEO("file.mp4", "video/mp4"),
    VOICE("file.ogg", "audio/ogg");

    private final String name, mime;
}