package com.iab.omid.library.inmobi.adsession;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;

/* loaded from: classes3.dex */
public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(RNAdsEvents.EVENT_LOADED),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER(InneractiveMediationNameConsts.OTHER);
    
    private final String impressionType;

    ImpressionType(String str) {
        this.impressionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.impressionType;
    }
}
