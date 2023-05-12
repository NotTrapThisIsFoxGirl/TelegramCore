package ru.arcanite.telegrambot.api.utils;

import lombok.experimental.UtilityClass;

import java.util.concurrent.atomic.AtomicInteger;

@UtilityClass
public class AttachName {

    private final AtomicInteger counter = new AtomicInteger();

    public String next() {
        return "attach" + counter.incrementAndGet();
    }

    public void reset() {
        counter.set(0);
    }
}