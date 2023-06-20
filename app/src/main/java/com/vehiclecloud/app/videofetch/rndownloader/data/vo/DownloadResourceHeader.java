package com.vehiclecloud.app.videofetch.rndownloader.data.vo;

/* loaded from: classes3.dex */
public class DownloadResourceHeader {
    public String header;
    public String resourceId;
    public String value;

    public static DownloadResourceHeader create(String str, String str2, String str3) {
        DownloadResourceHeader downloadResourceHeader = new DownloadResourceHeader();
        downloadResourceHeader.resourceId = str;
        downloadResourceHeader.header = str2;
        downloadResourceHeader.value = str3;
        return downloadResourceHeader;
    }
}
