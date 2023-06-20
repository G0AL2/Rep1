package com.fyber.inneractive.sdk.util;

import android.annotation.TargetApi;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public class r {
    @TargetApi(23)
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    public static boolean b(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            IAlog.a("isResponseValid: found invalid response status: %s", Integer.toString(responseCode));
            return false;
        }
        return true;
    }

    public static String a(String str, int i10, int i11, int i12) throws Exception {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.connect();
            InputStream a10 = a((URLConnection) httpURLConnection);
            String a11 = a(httpURLConnection);
            if (TextUtils.isEmpty(a11)) {
                String stringBuffer = b(httpURLConnection) ? s.a(a10, false).toString() : null;
                httpURLConnection.disconnect();
                return stringBuffer;
            } else if (i12 >= 0) {
                httpURLConnection.disconnect();
                return a(a11, i11, i10, i12);
            } else {
                throw new Exception("AdServer returned HTTP redirect response more than " + i12 + " times! aborting");
            }
        } catch (Exception e10) {
            IAlog.a("getBodyFromUrl failed with exception", e10, new Object[0]);
            throw e10;
        } catch (Throwable th) {
            IAlog.a("getBodyFromUrl failed with error", th, new Object[0]);
            return null;
        }
    }

    public static InputStream a(URLConnection uRLConnection) {
        InputStream bufferedInputStream;
        try {
            InputStream inputStream = uRLConnection.getInputStream();
            if (TextUtils.equals("gzip", uRLConnection.getContentEncoding())) {
                bufferedInputStream = new GZIPInputStream(inputStream);
            } else {
                bufferedInputStream = new BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(HttpURLConnection httpURLConnection) throws Exception {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 302 || responseCode == 303 || responseCode == 307) {
            IAlog.a("getRedirectUrl: received redirect code %s", Integer.toString(responseCode));
            String headerField = httpURLConnection.getHeaderField("Location");
            if (!TextUtils.isEmpty(headerField)) {
                IAlog.a("getRedirectUrl: redirecting target url: %s", headerField);
                return headerField;
            }
            throw new Exception("Server returned HTTP " + Integer.toString(responseCode) + " with empty location header!");
        }
        return null;
    }
}
