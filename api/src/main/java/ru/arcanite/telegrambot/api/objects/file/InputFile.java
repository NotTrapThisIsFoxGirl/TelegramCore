package ru.arcanite.telegrambot.api.objects.file;

import lombok.Getter;
import lombok.Setter;

import java.io.File;

@Getter
public class InputFile {

    private File file;
    private byte[] bytes;
    @Setter
    private String fileName;
    @Setter
    private String contentType;

    public InputFile(final File file, final String fileName, final String contentType) {
        this.file = file;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    public InputFile(final byte[] bytes, final String fileName, final String contentType) {
        this.bytes = bytes;
        this.fileName = fileName;
        this.contentType = contentType;
    }
}