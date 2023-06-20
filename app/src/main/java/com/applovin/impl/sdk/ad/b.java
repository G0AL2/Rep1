package com.applovin.impl.sdk.ad;

/* loaded from: classes.dex */
public enum b {
    UNKNOWN(0),
    APPLOVIN_PRIMARY_ZONE(1),
    APPLOVIN_CUSTOM_ZONE(2),
    APPLOVIN_MULTIZONE(3),
    REGULAR_AD_TOKEN(4),
    DECODED_AD_TOKEN_JSON(5);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f8075g;

    b(int i10) {
        this.f8075g = i10;
    }

    public static b a(int i10) {
        return i10 == 1 ? APPLOVIN_PRIMARY_ZONE : i10 == 2 ? APPLOVIN_CUSTOM_ZONE : i10 == 3 ? APPLOVIN_MULTIZONE : i10 == 4 ? REGULAR_AD_TOKEN : i10 == 5 ? DECODED_AD_TOKEN_JSON : UNKNOWN;
    }

    public int a() {
        return this.f8075g;
    }
}
