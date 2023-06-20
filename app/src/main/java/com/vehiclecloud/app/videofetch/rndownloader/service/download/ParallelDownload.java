package com.vehiclecloud.app.videofetch.rndownloader.service.download;

import com.vehiclecloud.app.videofetch.rndownloader.data.DownloadResourceDao;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTask;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import com.vehiclecloud.app.videofetch.rndownloader.media.CommonParser;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class ParallelDownload extends SubTasksDownload<DownloadTask, Integer> {
    public static final long ONE_CONNECTION_UPPER_LIMIT = 5242880;
    private static final long THREE_CONNECTION_UPPER_LIMIT = 31457280;
    private static final long TWO_CONNECTION_UPPER_LIMIT = 10485760;
    private List<DownloadTask> subTasks;

    public ParallelDownload(DownloadWorker downloadWorker, DownloadResourceWithHeaders downloadResourceWithHeaders) {
        super(downloadWorker, downloadResourceWithHeaders.resource, downloadResourceWithHeaders.headers);
    }

    private static int determineConnectionCount(long j10) {
        if (j10 < TWO_CONNECTION_UPPER_LIMIT) {
            return 2;
        }
        return j10 < THREE_CONNECTION_UPPER_LIMIT ? 3 : 4;
    }

    public static ParallelDownload download(DownloadWorker downloadWorker, DownloadResourceWithHeaders downloadResourceWithHeaders) {
        return new ParallelDownload(downloadWorker, downloadResourceWithHeaders);
    }

    private void initSubTasks() {
        int min = Math.min(determineConnectionCount(this.resource.totalBytes), getBestThreadNum());
        ArrayList arrayList = new ArrayList(min);
        long j10 = this.resource.totalBytes / min;
        int i10 = 0;
        while (i10 < min) {
            long j11 = i10 * j10;
            long j12 = i10 == min + (-1) ? 0L : ((i10 + 1) * j10) - 1;
            DownloadTask downloadTask = new DownloadTask();
            DownloadResourceDelta downloadResourceDelta = this.resource;
            downloadTask.resourceId = downloadResourceDelta.f28600id;
            downloadTask.uri = downloadResourceDelta.uri;
            downloadTask.fileName = downloadResourceDelta.fileName;
            downloadTask.totalBytes = j12 == 0 ? downloadResourceDelta.totalBytes - j11 : (j12 - j11) + 1;
            downloadTask.acceptPartial = downloadResourceDelta.acceptPartial;
            downloadTask.eTag = downloadResourceDelta.eTag;
            downloadTask.rangeStart = j11;
            downloadTask.rangeEnd = j12;
            downloadTask.status = DownloadResource.STATUS_PENDING;
            arrayList.add(downloadTask);
            i10++;
        }
        this.worker.mDownloadResourceDao.saveAllTasks(arrayList);
        this.subTasks = this.worker.mDownloadResourceDao.getAllTasksByResId(this.resource.f28600id);
    }

    private void initTasksTotalBytesAndFinishedCount() {
        int i10 = 0;
        for (DownloadTask downloadTask : this.subTasks) {
            if (downloadTask.status == 200) {
                i10++;
            }
        }
        this.tasksFinishedCount.set(i10);
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    protected ExecutorService createExecutor() {
        return Executors.newFixedThreadPool(this.subTasks.size());
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    protected List<DownloadTask> getTasks() {
        return this.subTasks;
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    protected void initTasks() {
        List<DownloadTask> allTasksByResId = this.worker.mDownloadResourceDao.getAllTasksByResId(this.resource.f28600id);
        this.subTasks = allTasksByResId;
        if (allTasksByResId.isEmpty()) {
            initSubTasks();
        } else {
            if (!this.subTasks.get(0).fileName.equals(this.resource.fileName)) {
                DownloadResourceDao downloadResourceDao = this.worker.mDownloadResourceDao;
                DownloadResourceDelta downloadResourceDelta = this.resource;
                downloadResourceDao.updateTasksFileName(downloadResourceDelta.f28600id, downloadResourceDelta.fileName, this.subTasks.get(0).fileName);
                for (DownloadTask downloadTask : this.subTasks) {
                    downloadTask.fileName = this.resource.fileName;
                }
            }
            initTasksTotalBytesAndFinishedCount();
            DownloadWorker downloadWorker = this.worker;
            DownloadResourceDelta downloadResourceDelta2 = this.resource;
            DownloaderHelper.pushProgressMsg(downloadWorker, downloadResourceDelta2, downloadResourceDelta2.totalBytes, downloadResourceDelta2.currentBytes, 0L, downloadResourceDelta2.progress);
        }
        startTasks();
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    protected void onFinished() {
        this.worker.mDownloadResourceDao.deleteAllTasksByResId(this.resource.f28600id);
        if (DownloadResource.TYPE_VIDEO.equals(this.resource.type)) {
            try {
                DownloadResourceDelta downloadResourceDelta = this.resource;
                downloadResourceDelta.duration = CommonParser.durationS(downloadResourceDelta.fileName);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    protected void updateProgress() {
        DownloadResourceDelta downloadResourceDelta = this.resource;
        long j10 = downloadResourceDelta.totalBytes;
        if (j10 > 0) {
            downloadResourceDelta.progress = (int) ((downloadResourceDelta.currentBytes * 100) / j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    public long getTaskTotalBytes(DownloadTask downloadTask) {
        return this.resource.totalBytes;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    public void updateTask(DownloadTask downloadTask) {
        this.worker.mDownloadResourceDao.updateTask(downloadTask);
    }
}
