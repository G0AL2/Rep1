package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public enum zzbxq {
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(DownloadResource.TYPE_VIDEO);
    
    private final String zze;

    zzbxq(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
