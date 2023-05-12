package ru.arcanite.telegrambot.api.handlers;

import ru.arcanite.telegrambot.api.objects.update.Update;

import java.util.List;

public interface UpdatesListener {

    UpdatesResponseType handle(List<Update> updates);
}