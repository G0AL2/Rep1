package com.vehiclecloud.app.videofetch.rndownloader.service.download;

import androidx.work.e;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import timber.log.a;

/* loaded from: classes3.dex */
public final class DownloaderHelper {
    private DownloaderHelper() {
    }

    public static void pushHeadersMsg(DownloadWorker downloadWorker, DownloadResourceDelta downloadResourceDelta) {
        downloadWorker.setProgressAsync(new e.a().g("id", downloadResourceDelta.f28600id).g(DownloadWorker.KEY_OUT_WORKER_ID, downloadResourceDelta.workerId).e("status", downloadResourceDelta.status).g(DownloadWorker.KEY_OUT_MIME_TYPE, downloadResourceDelta.mimeType).f(DownloadWorker.KEY_OUT_TOTAL_BYTES, downloadResourceDelta.totalBytes).g(DownloadWorker.KEY_OUT_E_TAG, downloadResourceDelta.eTag).e(DownloadWorker.KEY_OUT_ACCEPT_PARTIAL, downloadResourceDelta.acceptPartial).e("duration", downloadResourceDelta.duration).a());
    }

    public static void pushProgressMsg(DownloadWorker downloadWorker, DownloadResourceDelta downloadResourceDelta, long j10, long j11, long j12, int i10) {
        try {
            downloadWorker.mDownloadNotifier.progress(downloadWorker, downloadResourceDelta, j12, i10);
        } catch (Throwable th) {
            a.e(th, "setForegroundAsync get ex:", new Object[0]);
        }
        downloadWorker.setProgressAsync(new e.a().g("id", downloadResourceDelta.f28600id).g(DownloadWorker.KEY_OUT_WORKER_ID, downloadResourceDelta.workerId).e("status", downloadResourceDelta.status).f(DownloadWorker.KEY_OUT_SPEED, j12).e(DownloadWorker.KEY_OUT_PROGRESS, i10).f(DownloadWorker.KEY_OUT_TOTAL_BYTES, j10).f(DownloadWorker.KEY_OUT_CURRENT_BYTES, j11).a());
    }

    public static void pushStatusMsg(DownloadWorker downloadWorker, DownloadResourceDelta downloadResourceDelta) {
        downloadWorker.setProgressAsync(new e.a().g("id", downloadResourceDelta.f28600id).g(DownloadWorker.KEY_OUT_WORKER_ID, downloadResourceDelta.workerId).e("status", downloadResourceDelta.status).a());
    }
}
