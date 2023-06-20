package com.vehiclecloud.app.videofetch.webview;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public final class UrlConnectionInputStream extends InputStream {
    private final HttpURLConnection mConnection;

    public UrlConnectionInputStream(HttpURLConnection httpURLConnection) {
        this.mConnection = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.mConnection.getInputStream().read();
        if (read == -1) {
            this.mConnection.disconnect();
        }
        return read;
    }
}
