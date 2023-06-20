package com.vehiclecloud.app.videofetch.rndownloader.service.download;

import android.os.Build;
import android.os.SystemClock;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceHeader;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTaskBase;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.StopRequestException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import timber.log.a;

/* loaded from: classes3.dex */
public abstract class SubTasksDownload<T extends DownloadTaskBase, ID> {
    private ExecutorService executor;
    protected final Collection<DownloadResourceHeader> headers;
    private long mLastUpdateTime;
    private long mSpeedSampleStart;
    protected final DownloadResourceDelta resource;
    protected final DownloadWorker worker;
    private final CountDownLatch latch = new CountDownLatch(1);
    protected final AtomicInteger tasksFinishedCount = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class DownloadRunnable<T extends DownloadTaskBase, K> extends FileDownloadListener<T> implements Runnable {

        /* renamed from: downloader  reason: collision with root package name */
        private final SubTasksDownload<T, K> f28644downloader;

        public DownloadRunnable(DownloadWorker downloadWorker, T t10, Collection<DownloadResourceHeader> collection, SubTasksDownload<T, K> subTasksDownload) {
            super(downloadWorker, t10, collection);
            this.f28644downloader = subTasksDownload;
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
        protected long getTaskTotalBytes() {
            return this.f28644downloader.getTaskTotalBytes(this.task);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener, com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
        public void onException(StopRequestException stopRequestException) throws StopRequestException {
            super.onException(stopRequestException);
            this.f28644downloader.onTaskException(this, this.task);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener, com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
        public void onFinished() throws StopRequestException {
            super.onFinished();
            this.f28644downloader.onTaskFinished();
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
        protected void onHeaderParsed() {
            this.f28644downloader.onTaskHeaderParsed(this.task);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
        protected void onProgress(long j10, long j11, long j12) {
            this.f28644downloader.onTaskProgress();
        }

        @Override // java.lang.Runnable
        public void run() {
            new DownloadConnection(null, this.task.uri, this.headers, this.resuming).withConnection(this);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.FileDownloadListener
        protected void updateTask() {
            this.f28644downloader.updateTask(this.task);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SubTasksDownload(DownloadWorker downloadWorker, DownloadResource downloadResource, Collection<DownloadResourceHeader> collection) {
        this.worker = downloadWorker;
        this.resource = DownloadResourceDelta.create(downloadResource);
        this.headers = collection;
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTaskFinished() {
        int incrementAndGet = this.tasksFinishedCount.incrementAndGet();
        onSubTaskFinished();
        a.d("SubTasksDownload onTaskFinished %d, %d", Integer.valueOf(incrementAndGet), Integer.valueOf(getTasks().size()));
        if (incrementAndGet == getTasks().size()) {
            finished();
        } else {
            onTaskProgress();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTaskProgress() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.mSpeedSampleStart;
        if (elapsedRealtime - j10 > 500) {
            if (j10 != 0) {
                DownloadResourceDelta downloadResourceDelta = this.resource;
                downloadResourceDelta.speed = 0L;
                downloadResourceDelta.currentBytes = 0L;
                downloadResourceDelta.totalBytes = 0L;
                for (T t10 : getTasks()) {
                    DownloadResourceDelta downloadResourceDelta2 = this.resource;
                    downloadResourceDelta2.totalBytes += t10.totalBytes;
                    downloadResourceDelta2.currentBytes += t10.currentBytes;
                    if (t10.status == 192) {
                        downloadResourceDelta2.speed += t10.speed;
                    }
                }
                updateProgress();
                DownloadWorker downloadWorker = this.worker;
                DownloadResourceDelta downloadResourceDelta3 = this.resource;
                DownloaderHelper.pushProgressMsg(downloadWorker, downloadResourceDelta3, downloadResourceDelta3.totalBytes, downloadResourceDelta3.currentBytes, downloadResourceDelta3.speed, downloadResourceDelta3.progress);
                this.resource.speed = 0L;
            }
            this.mSpeedSampleStart = elapsedRealtime;
        }
        if (elapsedRealtime - this.mLastUpdateTime > Constants.MIN_PROGRESS_TIME) {
            this.mLastUpdateTime = elapsedRealtime;
            updateResource();
        }
    }

    private void start() {
        this.resource.status = DownloadResource.STATUS_RUNNING;
        updateResource();
        try {
            DownloaderHelper.pushStatusMsg(this.worker, this.resource);
            DownloadWorker downloadWorker = this.worker;
            downloadWorker.mDownloadNotifier.start(downloadWorker, this.resource);
        } catch (Throwable th) {
            a.e(th, "SubTasksDownload start get ex:", new Object[0]);
        }
        initTasks();
    }

    protected ExecutorService createExecutor() {
        return Executors.newFixedThreadPool(getBestThreadNum());
    }

    protected Runnable createTask(T t10) {
        return new DownloadRunnable(this.worker, t10, this.headers, this);
    }

    protected void finished() {
        try {
            onFinished();
            this.resource.status = 200;
            updateResource();
            DownloaderHelper.pushStatusMsg(this.worker, this.resource);
            stop();
        } finally {
            DownloadWorker downloadWorker = this.worker;
            downloadWorker.mDownloadNotifier.success(downloadWorker, this.resource);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getBestThreadNum() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int i10 = Build.VERSION.SDK_INT;
        return Math.max(Math.min(availableProcessors - (i10 < 24 ? 3 : 2), i10 >= 24 ? 4 : 2), 1);
    }

    protected long getTaskTotalBytes(T t10) {
        return t10.totalBytes;
    }

    protected abstract List<T> getTasks();

    protected abstract void initTasks();

    protected abstract void onFinished();

    protected void onSubTaskFinished() {
    }

    protected void onTaskException(DownloadRunnable<T, ID> downloadRunnable, T t10) {
        if (t10.status == 194 && !this.executor.isShutdown()) {
            try {
                this.executor.execute(downloadRunnable);
                return;
            } catch (Exception e10) {
                a.e(e10, "SubTaskDownload onTaskException retry get ex:", new Object[0]);
            }
        }
        try {
            stop();
            DownloadResource byId = this.worker.mDownloadResourceDao.getById(this.resource.f28600id);
            if (byId == null) {
                return;
            }
            if (byId.status != 490) {
                this.resource.status = t10.status;
            } else {
                this.resource.status = DownloadResource.STATUS_CANCELED;
            }
            this.resource.speed = 0L;
            updateResource();
            DownloadWorker downloadWorker = this.worker;
            downloadWorker.mDownloadNotifier.error(downloadWorker, this.resource);
        } catch (Exception e11) {
            a.e(e11, "SubTaskDownload onTaskException get ex:", new Object[0]);
        }
    }

    protected void onTaskHeaderParsed(T t10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void startTasks() {
        updateResource();
        this.executor = createExecutor();
        for (T t10 : getTasks()) {
            if (t10.status != 200) {
                this.executor.execute(createTask(t10));
            }
        }
        try {
            this.latch.await();
        } catch (InterruptedException e10) {
            a.e(e10, "startTasks await get ex:", new Object[0]);
        }
    }

    protected void stop() {
        this.executor.shutdownNow();
        this.latch.countDown();
    }

    protected void updateProgress() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateResource() {
        this.worker.mDownloadResourceDao.updateDelta(this.resource);
    }

    protected abstract void updateTask(T t10);
}
