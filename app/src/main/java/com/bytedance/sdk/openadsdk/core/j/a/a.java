package com.bytedance.sdk.openadsdk.core.j.a;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* compiled from: VastErrorCode.java */
/* loaded from: classes.dex */
public enum a {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(DownloadResource.STATUS_BAD_REQUEST),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);
    

    /* renamed from: h  reason: collision with root package name */
    private final int f12404h;

    a(int i10) {
        this.f12404h = i10;
    }

    public String a() {
        return String.valueOf(this.f12404h);
    }
}
