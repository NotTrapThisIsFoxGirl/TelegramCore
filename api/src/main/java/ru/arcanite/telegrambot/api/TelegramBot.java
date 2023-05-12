package ru.arcanite.telegrambot.api;

import com.google.gson.Gson;
import lombok.Getter;
import okhttp3.OkHttpClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.arcanite.telegrambot.api.exceptions.ExceptionHandler;
import ru.arcanite.telegrambot.api.handlers.Callback;
import ru.arcanite.telegrambot.api.handlers.UpdatesHandler;
import ru.arcanite.telegrambot.api.handlers.UpdatesListener;
import ru.arcanite.telegrambot.api.objects.file.File;
import ru.arcanite.telegrambot.api.requests.BaseRequest;
import ru.arcanite.telegrambot.api.requests.update.GetUpdates;
import ru.arcanite.telegrambot.api.responses.BaseResponse;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;

@Getter
public class TelegramBot {

    private static final String API_URL = "https://api.telegram.org/bot";
    private static final String FILE_API_URL = "https://api.telegram.org/file/bot";

    private final Logger logger = LogManager.getRootLogger();
    private final String token;
    private final Boolean useTestServer;
    private final TelegramBotClient client;
    private final UpdatesHandler updatesHandler;

    public TelegramBot(final String token, final boolean useTestServer, final int sleepTimeout) {
        this.token = token;
        this.useTestServer = useTestServer;
        this.client = new TelegramBotClient(
                new OkHttpClient.Builder().connectTimeout(75, TimeUnit.SECONDS).writeTimeout(75, TimeUnit.SECONDS).readTimeout(75, TimeUnit.SECONDS).build(),
                new Gson(),
                API_URL + token + (useTestServer ? "/test/" : "/")
        );
        this.updatesHandler = new UpdatesHandler(sleepTimeout);
    }

    public TelegramBot(final String token, final boolean useTestServer) {
        this(token, useTestServer, 100);
    }

    public TelegramBot(final String token) {
        this(token, false, 100);
    }

    public <T extends BaseRequest<T, R>, R extends BaseResponse> R execute(final BaseRequest<T, R> method) {
        return client.send(method);
    }

    public <T extends BaseRequest<T, R>, R extends BaseResponse> void executeAsync(final T method, final Callback<T, R> callback) {
        client.sendAsync(method, callback);
    }

    public String getFullFilePath(final File file) {
        final String filePath = file.getFilePath();
        try {
            final int slash = filePath.lastIndexOf("/") + 1;
            return FILE_API_URL + filePath.substring(0, slash) + URLEncoder.encode(filePath.substring(slash), "UTF-8").replace("+", "%20");
        } catch (final UnsupportedEncodingException exception) {
            return FILE_API_URL + filePath;
        }
    }

    public byte[] getFileContent(final File file) throws IOException {
        final String fileUrl = getFullFilePath(file);
        final URLConnection connection = new URL(fileUrl).openConnection();
        try (final InputStream is = connection.getInputStream()) {
            final ByteArrayOutputStream os = new ByteArrayOutputStream();
            final byte[] buffer = new byte[0xFFFF];
            for (int len = is.read(buffer); len != -1; len = is.read(buffer)) {
                os.write(buffer, 0, len);
            }
            return os.toByteArray();
        }
    }

    public void setUpdatesListener(final UpdatesListener listener) {
        setUpdatesListener(listener, new GetUpdates());
    }

    public void setUpdatesListener(final UpdatesListener listener, final GetUpdates request) {
        setUpdatesListener(listener, null, request);
    }

    public void setUpdatesListener(final UpdatesListener listener, final ExceptionHandler exceptionHandler) {
        setUpdatesListener(listener, exceptionHandler, new GetUpdates());
    }

    public void setUpdatesListener(final UpdatesListener listener, final ExceptionHandler exceptionHandler, final GetUpdates request) {
        updatesHandler.start(this, listener, exceptionHandler, request);
    }

    public void removeGetUpdatesListener() {
        updatesHandler.stop();
    }

    public void shutdown() {
        client.shutdown();
    }
}