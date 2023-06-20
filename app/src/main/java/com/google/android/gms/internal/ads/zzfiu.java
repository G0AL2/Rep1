package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public enum zzfiu {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(RNAdsEvents.EVENT_LOADED),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(InneractiveMediationNameConsts.OTHER);
    
    private final String zzj;

    zzfiu(String str) {
        this.zzj = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }
}
