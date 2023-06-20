package com.iab.omid.library.inmobi.adsession;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* loaded from: classes3.dex */
public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(DownloadResource.TYPE_VIDEO),
    AUDIO("audio");
    
    private final String creativeType;

    CreativeType(String str) {
        this.creativeType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.creativeType;
    }
}
