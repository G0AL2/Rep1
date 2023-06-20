package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public enum zzfis {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(DownloadResource.TYPE_VIDEO),
    AUDIO("audio");
    
    private final String zzg;

    zzfis(String str) {
        this.zzg = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzg;
    }
}
