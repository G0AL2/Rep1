package com.vehiclecloud.app.videofetch.rndownloader.service.connection;

import android.content.Intent;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTaskBase;
import java.io.IOException;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public final class Helpers {
    private Helpers() {
    }

    public static void closeQuietly(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static long getHeaderOfContentLength(HttpURLConnection httpURLConnection) {
        try {
            return Long.parseLong(httpURLConnection.getHeaderField("Content-Length"));
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static int isAcceptRange(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() == 206) {
                return 1;
            }
        } catch (IOException unused) {
        }
        return "bytes".equals(httpURLConnection.getHeaderField("Accept-Ranges")) ? 1 : -1;
    }

    public static boolean isStatusRetryable(int i10) {
        return i10 == 492 || i10 == 495 || i10 == 500 || i10 == 503;
    }

    public static boolean parseHeader(HttpURLConnection httpURLConnection, DownloadTaskBase downloadTaskBase) {
        boolean z10;
        String normalizeMimeType = Intent.normalizeMimeType(httpURLConnection.getContentType());
        if (normalizeMimeType == null || normalizeMimeType.equals(downloadTaskBase.mimeType)) {
            z10 = false;
        } else {
            downloadTaskBase.mimeType = normalizeMimeType;
            z10 = true;
        }
        if (httpURLConnection.getHeaderField("Transfer-Encoding") == null) {
            long headerOfContentLength = getHeaderOfContentLength(httpURLConnection);
            if (headerOfContentLength != downloadTaskBase.totalBytes) {
                downloadTaskBase.totalBytes = headerOfContentLength;
                z10 = true;
            }
        }
        String headerField = httpURLConnection.getHeaderField("ETag");
        if (headerField != null && !headerField.equals(downloadTaskBase.eTag)) {
            downloadTaskBase.eTag = headerField;
            z10 = true;
        }
        int isAcceptRange = isAcceptRange(httpURLConnection);
        if (isAcceptRange != downloadTaskBase.acceptPartial) {
            downloadTaskBase.acceptPartial = isAcceptRange;
            return true;
        }
        return z10;
    }
}
