package com.vehiclecloud.app.videofetch.rndownloader.service.download;

import android.os.Build;
import android.util.Log;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Helpers;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.StopRequestException;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.a;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public final class VideoDownload {
    private static final String TAG = "VideoDownload";

    private VideoDownload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doDownload(DownloadWorker downloadWorker, DownloadResourceWithHeaders downloadResourceWithHeaders) {
        DownloadResource downloadResource = downloadResourceWithHeaders.resource;
        if (downloadResource.acceptPartial != 0 && downloadResource.totalBytes > ParallelDownload.ONE_CONNECTION_UPPER_LIMIT) {
            ParallelDownload.download(downloadWorker, downloadResourceWithHeaders);
        } else {
            SequentialDownload.download(downloadWorker, downloadResourceWithHeaders);
        }
    }

    public static void download(final DownloadWorker downloadWorker, final DownloadResourceWithHeaders downloadResourceWithHeaders) {
        if (Build.VERSION.SDK_INT >= 24 && Runtime.getRuntime().availableProcessors() > 2) {
            DownloadResource downloadResource = downloadResourceWithHeaders.resource;
            if (downloadResource.totalBytes > 0) {
                doDownload(downloadWorker, downloadResourceWithHeaders);
                return;
            } else {
                new DownloadConnection(VersionInfo.GIT_BRANCH, downloadResource.uri, downloadResourceWithHeaders.headers, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.service.download.VideoDownload.1
                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                    public void onException(StopRequestException stopRequestException) throws StopRequestException {
                        Log.e(VideoDownload.TAG, "fetch headers ex:", stopRequestException);
                        SequentialDownload.download(downloadWorker, DownloadResourceWithHeaders.this);
                    }

                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                    public /* synthetic */ void onFinished() {
                        a.b(this);
                    }

                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                    public /* synthetic */ void onMovedPerm(String str) {
                        a.c(this, str);
                    }

                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                    public void onOk(HttpURLConnection httpURLConnection) {
                        Helpers.parseHeader(httpURLConnection, DownloadResourceWithHeaders.this.resource);
                        Log.d(VideoDownload.TAG, "fetch headers ok:" + DownloadResourceWithHeaders.this.resource.totalBytes);
                        VideoDownload.doDownload(downloadWorker, DownloadResourceWithHeaders.this);
                    }

                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                    public /* synthetic */ void onPartial(HttpURLConnection httpURLConnection) {
                        a.e(this, httpURLConnection);
                    }

                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                    public /* synthetic */ void onStart(HttpURLConnection httpURLConnection) {
                        a.f(this, httpURLConnection);
                    }

                    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                    public /* synthetic */ void onUnavailable(HttpURLConnection httpURLConnection) {
                        a.g(this, httpURLConnection);
                    }
                });
                return;
            }
        }
        SequentialDownload.download(downloadWorker, downloadResourceWithHeaders);
    }
}
