package com.learnium.RNDeviceInfo;

import com.amazon.device.ads.DtbDeviceDataRetriever;

/* compiled from: DeviceType.java */
/* loaded from: classes3.dex */
public enum a {
    HANDSET("Handset"),
    TABLET("Tablet"),
    TV("Tv"),
    UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
    

    /* renamed from: a  reason: collision with root package name */
    private final String f28274a;

    a(String str) {
        this.f28274a = str;
    }

    public String g() {
        return this.f28274a;
    }
}
