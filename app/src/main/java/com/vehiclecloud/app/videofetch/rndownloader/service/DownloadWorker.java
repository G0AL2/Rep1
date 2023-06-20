package com.vehiclecloud.app.videofetch.rndownloader.service;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.k;
import com.google.common.util.concurrent.c;
import com.google.common.util.concurrent.f;
import com.vehiclecloud.app.videofetch.rndownloader.data.AppDatabase;
import com.vehiclecloud.app.videofetch.rndownloader.data.DownloadResourceDao;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceSyncToGalleryStatus;
import com.vehiclecloud.app.videofetch.rndownloader.lib.Analytics;
import com.vehiclecloud.app.videofetch.rndownloader.media.DashParser;
import com.vehiclecloud.app.videofetch.rndownloader.media.HlsParser;
import com.vehiclecloud.app.videofetch.rndownloader.service.download.DashDownload;
import com.vehiclecloud.app.videofetch.rndownloader.service.download.HlsDownload;
import com.vehiclecloud.app.videofetch.rndownloader.service.download.SequentialDownload;
import com.vehiclecloud.app.videofetch.rndownloader.service.download.VideoDownload;
import com.vehiclecloud.app.videofetch.rndownloader.util.FS;
import com.vehiclecloud.app.videofetch.rndownloader.util.Scopes;
import java.io.IOException;

/* loaded from: classes3.dex */
public class DownloadWorker extends Worker {
    public static final String KEY_INOUT_ID = "id";
    public static final String KEY_OUT_ACCEPT_PARTIAL = "acceptPartial";
    public static final String KEY_OUT_CURRENT_BYTES = "currentBytes";
    public static final String KEY_OUT_DURATION = "duration";
    public static final String KEY_OUT_E_TAG = "eTag";
    public static final String KEY_OUT_MIME_TYPE = "mimeType";
    public static final String KEY_OUT_PROGRESS = "progress";
    public static final String KEY_OUT_SPEED = "speed";
    public static final String KEY_OUT_STATUS = "status";
    public static final String KEY_OUT_TOTAL_BYTES = "totalBytes";
    public static final String KEY_OUT_WORKER_ID = "workerId";
    private final Analytics analytics;
    public final DownloadNotifier mDownloadNotifier;
    public final DownloadResourceDao mDownloadResourceDao;

    public DownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.analytics = new Analytics(getApplicationContext());
        this.mDownloadResourceDao = AppDatabase.getInstance(context).getDownloadResourceDao();
        this.mDownloadNotifier = DownloadNotifier.getInstance(context);
    }

    public static /* synthetic */ void a(DownloadWorker downloadWorker, String str, f fVar) {
        downloadWorker.lambda$getForegroundInfoAsync$0(str, fVar);
    }

    public /* synthetic */ void lambda$getForegroundInfoAsync$0(String str, f fVar) {
        fVar.C(this.mDownloadNotifier.createProgressForegroundInfo(this, DownloadResourceDelta.create(this.mDownloadResourceDao.getById(str)), 0L, 0));
    }

    @Override // androidx.work.Worker
    public k.a doWork() {
        String j10 = getInputData().j("id");
        DownloadResourceWithHeaders withHeadersById = this.mDownloadResourceDao.getWithHeadersById(j10);
        try {
            this.mDownloadNotifier.start(this, DownloadResourceDelta.create(withHeadersById.resource));
            DownloadResource downloadResource = withHeadersById.resource;
            timber.log.a.d("do work:[%s]; resource id: %s; %s; %s", getId(), j10, downloadResource.uri, downloadResource.fileName);
            String str = withHeadersById.resource.fileExt;
            if (HlsParser.EXTENSION.equals(str)) {
                HlsDownload.download(this, withHeadersById);
            } else if (DashParser.EXTENSION.equals(str)) {
                DashDownload.download(this, withHeadersById);
            } else if (DownloadResource.TYPE_VIDEO.equals(withHeadersById.resource.type)) {
                VideoDownload.download(this, withHeadersById);
            } else {
                SequentialDownload.download(this, withHeadersById);
            }
            DownloadResource byId = this.mDownloadResourceDao.getById(j10);
            int i10 = byId.status;
            if (i10 == 193 || i10 == 194) {
                return k.a.b();
            }
            if (i10 != 200) {
                this.analytics.logEvent(Analytics.Event.DOWNLOAD_FAILED, byId);
                return k.a.a();
            }
            this.analytics.logEvent(Analytics.Event.DOWNLOAD_SUCCEED, byId);
            if (!HlsParser.EXTENSION.equals(byId.fileExt) && !DashParser.EXTENSION.equals(byId.fileExt) && byId.syncToGallery == 1) {
                try {
                    FS.insertResourceToMediaStore(getApplicationContext(), byId);
                    this.mDownloadResourceDao.updateSyncToGalleryStatus(new DownloadResourceSyncToGalleryStatus(j10, 2));
                } catch (IOException e10) {
                    timber.log.a.e(e10, "syncToGallery %s, get ex:", byId.fileName);
                }
            }
            return k.a.c();
        } catch (Throwable unused) {
            return k.a.b();
        }
    }

    @Override // androidx.work.Worker, androidx.work.k
    public c<g> getForegroundInfoAsync() {
        final f D = f.D();
        final String j10 = getInputData().j("id");
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.service.a
            @Override // java.lang.Runnable
            public final void run() {
                DownloadWorker.a(DownloadWorker.this, j10, D);
            }
        });
        return D;
    }
}
