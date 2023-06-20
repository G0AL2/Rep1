package com.vehiclecloud.app.videofetch.rndownloader.data.vo;

/* loaded from: classes3.dex */
public abstract class DownloadTaskBase {
    public int acceptPartial;
    public long currentBytes;
    public long downloadEndOn;
    public long downloadStartedOn;
    public String eTag;
    public String mimeType;
    public int numFailed;
    public int progress;
    public long rangeEnd;
    public long rangeStart;
    public int retryTimes;
    public long speed;
    public int status;
    public long totalBytes;
    public String uri = "";
    public String fileName = "";
}
