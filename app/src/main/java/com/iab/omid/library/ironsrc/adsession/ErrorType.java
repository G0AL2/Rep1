package com.iab.omid.library.ironsrc.adsession;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* loaded from: classes3.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO(DownloadResource.TYPE_VIDEO);
    
    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.errorType;
    }
}
