package com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTaskBase;

/* loaded from: classes3.dex */
public class DownloadResourceDelta extends DownloadTaskBase {
    public int duration;

    /* renamed from: id  reason: collision with root package name */
    public String f28600id;
    public String title;
    public String type;
    public int width;
    public String workerId;

    public static DownloadResourceDelta create(DownloadResource downloadResource) {
        DownloadResourceDelta downloadResourceDelta = new DownloadResourceDelta();
        downloadResourceDelta.f28600id = downloadResource.f28597id;
        downloadResourceDelta.type = downloadResource.type;
        downloadResourceDelta.title = downloadResource.title;
        downloadResourceDelta.workerId = downloadResource.workerId;
        downloadResourceDelta.duration = downloadResource.duration;
        downloadResourceDelta.uri = downloadResource.uri;
        downloadResourceDelta.fileName = downloadResource.fileName;
        downloadResourceDelta.mimeType = downloadResource.mimeType;
        downloadResourceDelta.eTag = downloadResource.eTag;
        downloadResourceDelta.acceptPartial = downloadResource.acceptPartial;
        downloadResourceDelta.rangeStart = downloadResource.rangeStart;
        downloadResourceDelta.rangeEnd = downloadResource.rangeEnd;
        downloadResourceDelta.totalBytes = downloadResource.totalBytes;
        downloadResourceDelta.currentBytes = downloadResource.currentBytes;
        downloadResourceDelta.speed = downloadResource.speed;
        downloadResourceDelta.progress = downloadResource.progress;
        downloadResourceDelta.retryTimes = downloadResource.retryTimes;
        downloadResourceDelta.status = downloadResource.status;
        downloadResourceDelta.numFailed = downloadResource.numFailed;
        downloadResourceDelta.downloadStartedOn = downloadResource.downloadStartedOn;
        downloadResourceDelta.downloadEndOn = downloadResource.downloadEndOn;
        downloadResourceDelta.width = downloadResource.width;
        return downloadResourceDelta;
    }
}
