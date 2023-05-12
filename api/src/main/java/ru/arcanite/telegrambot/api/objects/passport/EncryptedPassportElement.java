package ru.arcanite.telegrambot.api.objects.passport;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import ru.arcanite.telegrambot.api.TelegramBot;
import ru.arcanite.telegrambot.api.objects.file.File;
import ru.arcanite.telegrambot.api.requests.GetFile;
import ru.arcanite.telegrambot.api.utils.GsonUtil;
import ru.arcanite.telegrambot.api.utils.decrypt.Decrypt;

@Getter
public class EncryptedPassportElement {

    private EncryptedPassportElementType type;
    private String data;
    @SerializedName("phone_number")
    private String phoneNumber;
    private String email;
    private PassportFile[] files;
    @SerializedName("front_side")
    private PassportFile frontSide;
    @SerializedName("reverse_side")
    private PassportFile reverseSide;
    private PassportFile selfie;
    private PassportFile[] translation;
    private String hash;

    public DecryptedData decryptData(final Credentials credentials) throws Exception {
        final Class<? extends DecryptedData> clazz = dataClass();
        if (clazz == null || data == null) return null;
        final SecureValue secureValue = credentials.getSecureData().ofType(type);
        final DataCredentials dataCredentials = secureValue.getData();
        final String dataStr = Decrypt.decryptData(data, dataCredentials.getDataHash(), dataCredentials.getSecret());
        return GsonUtil.fromJson(dataStr, clazz);
    }

    public byte[] decryptFile(final PassportFile passportFile, final FileCredentials fileCredentials, final TelegramBot bot) throws Exception {
        final File file = bot.execute(new GetFile(passportFile.getFileId())).getFile();
        final byte[] fileData = bot.getFileContent(file);
        return decryptFile(fileData, fileCredentials);
    }

    public byte[] decryptFile(final PassportFile passportFile, final Credentials credentials, final TelegramBot bot) throws Exception {
        final FileCredentials fileCredentials = findFileCredentials(passportFile, credentials);
        if (fileCredentials == null) {
            throw new IllegalArgumentException("Don't have file credentials for " + passportFile);
        }
        return decryptFile(passportFile, fileCredentials, bot);
    }

    public byte[] decryptFile(final byte[] fileData, final FileCredentials fileCredentials) throws Exception {
        return Decrypt.decryptFile(fileData, fileCredentials.getFileHash(), fileCredentials.getSecret());
    }

    private FileCredentials findFileCredentials(final PassportFile passportFile, final Credentials credentials) {
        final SecureValue secureValue = credentials.getSecureData().ofType(type);
        if (passportFile.equals(frontSide)) return secureValue.getFrontSide();
        if (passportFile.equals(reverseSide)) return secureValue.getReverseSide();
        if (passportFile.equals(selfie)) return secureValue.getSelfie();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (passportFile.equals(files[i])) return secureValue.getFiles()[i];
            }
        }
        if (translation != null) {
            for (int i = 0; i < translation.length; i++) {
                if (passportFile.equals(translation[i])) return secureValue.getTranslation()[i];
            }
        }
        return null;
    }

    private Class<? extends DecryptedData> dataClass() {
        return type.equals(EncryptedPassportElementType.PASSPORT) || type.equals(EncryptedPassportElementType.INTERNAL_PASSPORT) || type.equals(EncryptedPassportElementType.DRIVER_LICENSE) || type.equals(EncryptedPassportElementType.IDENTITY_CARD) ? IdDocumentData.class : type.equals(EncryptedPassportElementType.PERSONAL_DETAILS) ? PersonalDetails.class : type.equals(EncryptedPassportElementType.ADDRESS) ? ResidentialAddress.class : null;
    }
}