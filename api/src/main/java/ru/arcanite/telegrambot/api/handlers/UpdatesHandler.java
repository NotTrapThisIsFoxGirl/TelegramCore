package ru.arcanite.telegrambot.api.handlers;

import lombok.Getter;
import ru.arcanite.telegrambot.api.TelegramBot;
import ru.arcanite.telegrambot.api.exceptions.ExceptionHandler;
import ru.arcanite.telegrambot.api.exceptions.TelegramException;
import ru.arcanite.telegrambot.api.objects.update.Update;
import ru.arcanite.telegrambot.api.requests.update.GetUpdates;
import ru.arcanite.telegrambot.api.responses.GetUpdatesResponse;

import java.io.IOException;
import java.util.List;

@Getter
public class UpdatesHandler {

    private final Long sleepTimeout;

    private TelegramBot bot;
    private UpdatesListener listener;
    private ExceptionHandler exceptionHandler;

    public UpdatesHandler(final long sleepTimeout) {
        this.sleepTimeout = sleepTimeout;
    }

    public void start(final TelegramBot bot, final UpdatesListener listener, final ExceptionHandler exceptionHandler, final GetUpdates request) {
        this.bot = bot;
        this.listener = listener;
        this.exceptionHandler = exceptionHandler;
        getUpdates(request);
    }

    public void stop() {
        this.bot = null;
        this.listener = null;
        this.exceptionHandler = null;
    }

    private void getUpdates(final GetUpdates request) {
        if (bot == null || listener == null) return;
        bot.executeAsync(request, new Callback<GetUpdates, GetUpdatesResponse>() {
            @Override
            public void onResponse(GetUpdates request, final GetUpdatesResponse response) {
                if (listener == null) return;
                if (!response.isOk() || response.getUpdates() == null || response.getUpdates().size() == 0) {
                    if (!response.isOk()) {
                        if (exceptionHandler != null) {
                            final String message = "GetUpdates failed with error_code " + response.getErrorCode() + " " + response.getDescription();
                            exceptionHandler.onException(new TelegramException(message, response));
                        } else {
                            bot.getLogger().info("Update listener error for request " + request.toWebhookResponse() + " with response " + response.getErrorCode() + " " + response.getDescription());
                        }
                    }
                    sleep();
                    getUpdates(request);
                    return;
                }

                final List<Update> updates = response.getUpdates();
                final int lastConfirmedUpdate = listener.handle(updates).getValue();
                if (lastConfirmedUpdate != -2) {
                    final int offset = lastConfirmedUpdate == -1 ? lastUpdateId(updates) + 1 : lastConfirmedUpdate + 1;
                    request = request.setOffset(offset);
                }
                getUpdates(request);
            }

            @Override
            public void onFailure(final GetUpdates request, final IOException exception) {
                if (exceptionHandler != null) {
                    exceptionHandler.onException(new TelegramException(exception));
                } else {
                    bot.getLogger().error("Update listener failure!", exception);
                }
                sleep();
                getUpdates(request);
            }
        });
    }

    private int lastUpdateId(final List<Update> updates) {
        return updates.get(updates.size() - 1).getId();
    }

    private void sleep() {
        if (sleepTimeout <= 0L) return;
        try {
            Thread.sleep(sleepTimeout);
        } catch (final InterruptedException ignored) {
        }
    }
}
