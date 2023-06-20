package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* renamed from: com.facebook.ads.redexgen.X.Xa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1376Xa implements C8Y {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ XZ A01;

    public C1376Xa(XZ xz, AdvertisingId advertisingId) {
        this.A01 = xz;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.C8Y
    public final boolean A8Y() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.C8Y
    public final String getId() {
        return this.A00.getId();
    }
}
