package com.vehiclecloud.app.videofetch.rndownloader.media;

import android.media.MediaMetadataRetriever;
import android.util.Log;
import com.facebook.react.bridge.WritableMap;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceHeader;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Helpers;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.StopRequestException;
import com.vehiclecloud.app.videofetch.rndownloader.util.FS;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class CommonParser {
    private static final String TAG = "CommonParser";

    private CommonParser() {
    }

    public static int durationS(String str) throws IOException {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            mediaMetadataRetriever.release();
            return Integer.parseInt(extractMetadata) / 1000;
        } catch (Exception e10) {
            Log.d(TAG, "metadata get ex:", e10);
            throw e10;
        }
    }

    public static void getContentLengthForSource(final String str, Collection<DownloadResourceHeader> collection, final WritableMap writableMap) {
        new DownloadConnection(VersionInfo.GIT_BRANCH, str, collection, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.media.CommonParser.1
            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onException(StopRequestException stopRequestException) throws StopRequestException {
                Log.e(CommonParser.TAG, "getContentLengthForSource get ex:", stopRequestException);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onFinished() {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.b(this);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onMovedPerm(String str2) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.c(this, str2);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onOk(HttpURLConnection httpURLConnection) {
                long headerOfContentLength = Helpers.getHeaderOfContentLength(httpURLConnection);
                WritableMap.this.putDouble(str, headerOfContentLength == -1 ? 0.0d : headerOfContentLength);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onPartial(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.e(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onStart(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.f(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onUnavailable(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.g(this, httpURLConnection);
            }
        });
    }

    public static void rmFiles(DownloadResource downloadResource) throws IOException {
        FS.deleteRecursive(new File(downloadResource.fileName));
    }
}
