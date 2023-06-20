package com.vehiclecloud.app.videofetch.rndownloader.service.download;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTask;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import com.vehiclecloud.app.videofetch.rndownloader.media.StreamingParser;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import com.vehiclecloud.app.videofetch.rndownloader.util.FS;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class AbstractStreamingDownload extends SubTasksDownload<DownloadTask, Integer> {
    protected List<DownloadTask> segmentTasks;

    public AbstractStreamingDownload(DownloadWorker downloadWorker, DownloadResourceWithHeaders downloadResourceWithHeaders) {
        super(downloadWorker, downloadResourceWithHeaders.resource, downloadResourceWithHeaders.headers);
    }

    private void initTasksTotalBytesAndFinishedCount() {
        int i10 = 0;
        long j10 = 0;
        int i11 = 0;
        for (DownloadTask downloadTask : this.segmentTasks) {
            if (downloadTask.status == 200) {
                i11++;
            }
            long j11 = downloadTask.totalBytes;
            if (j11 > 0) {
                j10 += j11;
                i10++;
            }
        }
        int size = this.segmentTasks.size() - i10;
        if (size < this.segmentTasks.size() && j10 > 0) {
            this.resource.totalBytes = j10 + ((size * j10) / j10);
        }
        this.tasksFinishedCount.set(i11);
        DownloadWorker downloadWorker = this.worker;
        DownloadResourceDelta downloadResourceDelta = this.resource;
        DownloaderHelper.pushProgressMsg(downloadWorker, downloadResourceDelta, downloadResourceDelta.totalBytes, downloadResourceDelta.currentBytes, downloadResourceDelta.speed, downloadResourceDelta.progress);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String createAndGetBaseDir() {
        String segmentsDir = StreamingParser.segmentsDir(this.resource);
        FS.createDirectory(segmentsDir);
        return segmentsDir;
    }

    protected abstract void fetchPlayList();

    /* JADX INFO: Access modifiers changed from: protected */
    public String getRelationDir(String str) {
        return str.substring(str.lastIndexOf("/") + 1) + "/";
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    protected List<DownloadTask> getTasks() {
        return this.segmentTasks;
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    protected void initTasks() {
        List<DownloadTask> allTasksByResId = this.worker.mDownloadResourceDao.getAllTasksByResId(this.resource.f28600id);
        this.segmentTasks = allTasksByResId;
        if (allTasksByResId.isEmpty()) {
            fetchPlayList();
            return;
        }
        initTasksTotalBytesAndFinishedCount();
        startTasks();
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    protected void onFinished() {
        this.worker.mDownloadResourceDao.deleteAllTasksByResId(this.resource.f28600id);
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    protected void onSubTaskFinished() {
        this.resource.progress = (this.tasksFinishedCount.get() * 100) / this.segmentTasks.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    public void onTaskHeaderParsed(DownloadTask downloadTask) {
        int i10 = 0;
        long j10 = 0;
        for (DownloadTask downloadTask2 : this.segmentTasks) {
            long j11 = downloadTask2.totalBytes;
            if (j11 > 0) {
                j10 += j11;
                i10++;
            }
        }
        int size = this.segmentTasks.size() - i10;
        if (size >= this.segmentTasks.size() || j10 <= 0) {
            return;
        }
        this.resource.totalBytes = j10 + ((size * j10) / j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.SubTasksDownload
    public void updateTask(DownloadTask downloadTask) {
        this.worker.mDownloadResourceDao.updateTask(downloadTask);
    }
}
