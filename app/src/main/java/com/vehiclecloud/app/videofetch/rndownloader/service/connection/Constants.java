package com.vehiclecloud.app.videofetch.rndownloader.service.connection;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class Constants {
    public static final int BUFFER_SIZE = 8192;
    public static final String DEFAULT_DL_BINARY_EXTENSION = ".bin";
    public static final String DEFAULT_DL_FILENAME = "downloadfile";
    public static final String DEFAULT_DL_HTML_EXTENSION = ".html";
    public static final String DEFAULT_DL_TEXT_EXTENSION = ".txt";
    public static final String DEFAULT_USER_AGENT;
    public static final String FILENAME_SEQUENCE_SEPARATOR = "-";
    public static final int MAX_REDIRECTS = 5;
    public static final int MAX_RETRIES = 5;
    public static final int MAX_RETRY_AFTER = 86400;
    public static final int MIN_PROGRESS_STEP = 65536;
    public static final long MIN_PROGRESS_TIME = 2000;
    public static final int MIN_RETRY_AFTER = 30;
    public static final String RECOVERY_DIRECTORY = "recovery";
    public static final String TAG = "RNDownloader";

    static {
        StringBuilder sb2 = new StringBuilder();
        String str = Build.VERSION.RELEASE;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(str);
        boolean z12 = !TextUtils.isEmpty(Build.ID);
        z10 = (!"REL".equals(Build.VERSION.CODENAME) || TextUtils.isEmpty(Build.MODEL)) ? false : false;
        sb2.append("AndroidDownloadManager");
        if (z11) {
            sb2.append("/");
            sb2.append(str);
        }
        sb2.append(" (Linux; U; Android");
        if (z11) {
            sb2.append(" ");
            sb2.append(str);
        }
        if (z10 || z12) {
            sb2.append(";");
            if (z10) {
                sb2.append(" ");
                sb2.append(Build.MODEL);
            }
            if (z12) {
                sb2.append(" Build/");
                sb2.append(Build.ID);
            }
        }
        sb2.append(")");
        DEFAULT_USER_AGENT = sb2.toString();
    }
}
