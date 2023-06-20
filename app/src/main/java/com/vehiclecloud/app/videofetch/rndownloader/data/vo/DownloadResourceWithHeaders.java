package com.vehiclecloud.app.videofetch.rndownloader.data.vo;

import java.util.List;

/* loaded from: classes3.dex */
public class DownloadResourceWithHeaders {
    public List<DownloadResourceHeader> headers;
    public DownloadResource resource;

    public static DownloadResourceWithHeaders create(DownloadResource downloadResource, List<DownloadResourceHeader> list) {
        DownloadResourceWithHeaders downloadResourceWithHeaders = new DownloadResourceWithHeaders();
        downloadResourceWithHeaders.resource = downloadResource;
        downloadResourceWithHeaders.headers = list;
        return downloadResourceWithHeaders;
    }
}
