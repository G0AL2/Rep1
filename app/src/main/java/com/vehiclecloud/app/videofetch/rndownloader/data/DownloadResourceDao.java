package com.vehiclecloud.app.videofetch.rndownloader.data;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceHeader;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTask;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceFolder;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceId;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceLatestOpenedOn;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceMergedFileName;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceStatus;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceStatusAndDuration;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceSyncToGalleryStatus;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceTotalBytes;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceWorkerId;
import java.util.List;

/* loaded from: classes3.dex */
public interface DownloadResourceDao {
    void deleteAllByIds(List<DownloadResourceId> list);

    void deleteAllTasksByResId(String str);

    List<DownloadResource> getAll();

    List<DownloadTask> getAllTasksByResId(String str);

    DownloadResource getById(String str);

    DownloadResource getByWorkerId(String str);

    int getStatusById(String str);

    int getUnwatchedCount();

    DownloadResourceWithHeaders getWithHeadersById(String str);

    List<DownloadResourceWorkerId> getWorkerIdByIds(List<String> list);

    List<DownloadResource> loadAllFilesByStatus(List<Integer> list);

    void save(DownloadResource downloadResource);

    void saveAll(List<DownloadResource> list);

    void saveAllTasks(List<DownloadTask> list);

    void saveHeaders(List<DownloadResourceHeader> list);

    void updateAllFolder(List<DownloadResourceFolder> list);

    void updateAllLatestOpenedOn(List<DownloadResourceLatestOpenedOn> list);

    void updateAllStatus(List<DownloadResourceStatus> list);

    void updateAllStatusAndDuration(List<DownloadResourceStatusAndDuration> list);

    void updateAllTotalBytes(List<DownloadResourceTotalBytes> list);

    void updateDelta(DownloadResourceDelta downloadResourceDelta);

    void updateFileItemsNetworkType(int i10);

    void updateMergedFileName(DownloadResourceMergedFileName downloadResourceMergedFileName);

    void updateStatus(DownloadResourceStatus downloadResourceStatus);

    void updateSyncToGalleryStatus(DownloadResourceSyncToGalleryStatus downloadResourceSyncToGalleryStatus);

    void updateTask(DownloadTask downloadTask);

    void updateTasksFileName(String str, String str2, String str3);
}
