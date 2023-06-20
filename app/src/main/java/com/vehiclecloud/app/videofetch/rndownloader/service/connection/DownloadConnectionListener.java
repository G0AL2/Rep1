package com.vehiclecloud.app.videofetch.rndownloader.service.connection;

import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public interface DownloadConnectionListener {
    void onException(StopRequestException stopRequestException) throws StopRequestException;

    void onFinished() throws StopRequestException;

    void onMovedPerm(String str);

    void onOk(HttpURLConnection httpURLConnection);

    void onPartial(HttpURLConnection httpURLConnection);

    void onStart(HttpURLConnection httpURLConnection);

    void onUnavailable(HttpURLConnection httpURLConnection);
}
