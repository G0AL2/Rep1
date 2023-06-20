package com.vehiclecloud.app.videofetch.rndownloader.service.download;

import android.util.Log;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import com.vehiclecloud.app.videofetch.rndownloader.media.CommonParser;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Helpers;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.StopRequestException;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.a;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public final class SequentialDownload extends FileDownloadListener<DownloadResourceDelta> {
    public static void download(final DownloadWorker downloadWorker, final DownloadResourceWithHeaders downloadResourceWithHeaders) {
        DownloadResource downloadResource = downloadResourceWithHeaders.resource;
        if (downloadResource.totalBytes > 0) {
            new SequentialDownload(downloadWorker, downloadResourceWithHeaders);
        } else {
            new DownloadConnection(VersionInfo.GIT_BRANCH, downloadResource.uri, downloadResourceWithHeaders.headers, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.service.download.SequentialDownload.1
                @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                public void onException(StopRequestException stopRequestException) throws StopRequestException {
                    Log.e(FileDownloadListener.TAG, "fetch headers ex:", stopRequestException);
                    new SequentialDownload(downloadWorker, DownloadResourceWithHeaders.this);
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
                    Log.d(FileDownloadListener.TAG, "fetch headers ok:" + DownloadResourceWithHeaders.this.resource.totalBytes);
                    new SequentialDownload(downloadWorker, DownloadResourceWithHeaders.this);
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
        }
    }

    private void start() {
        T t10 = this.task;
        onProgress(((DownloadResourceDelta) t10).totalBytes, ((DownloadResourceDelta) t10).currentBytes, 0L);
        new DownloadConnection(null, ((DownloadResourceDelta) this.task).uri, this.headers, this.resuming).withConnection(this);
    }

    private void updateProgressStatus() {
        Log.d(FileDownloadListener.TAG, "updateProgressStatus:" + ((DownloadResourceDelta) this.task).status);
        DownloaderHelper.pushStatusMsg(this.worker, (DownloadResourceDelta) this.task);
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
    protected int getTaskStatusFromDB() {
        return this.worker.mDownloadResourceDao.getStatusById(((DownloadResourceDelta) this.task).f28600id);
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener, com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public void onException(StopRequestException stopRequestException) throws StopRequestException {
        try {
            if (stopRequestException.getFinalStatus() == 489 && this.resuming) {
                this.resuming = false;
                T t10 = this.task;
                ((DownloadResourceDelta) t10).acceptPartial = 0;
                ((DownloadResourceDelta) t10).currentBytes = 0L;
                ((DownloadResourceDelta) t10).speed = 0L;
                updateTask();
                start();
                return;
            }
            super.onException(stopRequestException);
            Log.d(FileDownloadListener.TAG, "onException:" + ((DownloadResourceDelta) this.task).status);
            updateProgressStatus();
        } finally {
            DownloadWorker downloadWorker = this.worker;
            downloadWorker.mDownloadNotifier.error(downloadWorker, (DownloadResourceDelta) this.task);
        }
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener, com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public void onFinished() throws StopRequestException {
        try {
            super.onFinished();
            if (DownloadResource.TYPE_VIDEO.equals(((DownloadResourceDelta) this.task).type)) {
                try {
                    T t10 = this.task;
                    ((DownloadResourceDelta) t10).duration = CommonParser.durationS(((DownloadResourceDelta) t10).fileName);
                    updateTask();
                    DownloaderHelper.pushHeadersMsg(this.worker, (DownloadResourceDelta) this.task);
                } catch (Exception unused) {
                }
            }
            Log.d(FileDownloadListener.TAG, "onFinished:" + ((DownloadResourceDelta) this.task).status);
            updateProgressStatus();
        } finally {
            DownloadWorker downloadWorker = this.worker;
            downloadWorker.mDownloadNotifier.success(downloadWorker, (DownloadResourceDelta) this.task);
        }
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
    public void onProgress(long j10, long j11, long j12) {
        Log.d(FileDownloadListener.TAG, "onProgress total:" + j10 + ";current: " + j11 + "; speed: " + j12);
        DownloaderHelper.pushProgressMsg(this.worker, (DownloadResourceDelta) this.task, j10, j11, j12, j10 > 0 ? (int) ((100 * j11) / j10) : 0);
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener, com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
    public void onStart(HttpURLConnection httpURLConnection) {
        super.onStart(httpURLConnection);
        try {
            updateProgressStatus();
        } catch (Throwable th) {
            timber.log.a.e(th, "SequentialDownload onStart get ex:", new Object[0]);
        }
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
    protected boolean parseOkHeaders(HttpURLConnection httpURLConnection) {
        boolean parseOkHeaders = super.parseOkHeaders(httpURLConnection);
        if (parseOkHeaders) {
            DownloaderHelper.pushHeadersMsg(this.worker, (DownloadResourceDelta) this.task);
        }
        return parseOkHeaders;
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
    protected void updateTask() {
        this.worker.mDownloadResourceDao.updateDelta((DownloadResourceDelta) this.task);
    }

    private SequentialDownload(DownloadWorker downloadWorker, DownloadResourceWithHeaders downloadResourceWithHeaders) {
        super(downloadWorker, DownloadResourceDelta.create(downloadResourceWithHeaders.resource), downloadResourceWithHeaders.headers);
        start();
    }
}
