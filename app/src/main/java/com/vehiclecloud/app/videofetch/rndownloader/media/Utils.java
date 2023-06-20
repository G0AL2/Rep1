package com.vehiclecloud.app.videofetch.rndownloader.media;

import android.net.Uri;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public class Utils {
    private Utils() {
    }

    public static Uri connUriOf(HttpURLConnection httpURLConnection) {
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
