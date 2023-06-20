package cb;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;

/* loaded from: classes3.dex */
public final class q {
    public static String a(File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().replaceFirst("(_\\d+)?\\.apk", "").replace("base-", "config.").replace(Constants.FILENAME_SEQUENCE_SEPARATOR, ".config.").replace(".config.master", "").replace("config.master", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static <T> void b(T t10, Object obj) {
        if (t10 == null) {
            throw new NullPointerException((String) obj);
        }
    }

    public static void c(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
