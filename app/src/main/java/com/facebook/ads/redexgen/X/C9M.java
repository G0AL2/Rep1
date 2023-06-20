package com.facebook.ads.redexgen.X;

import com.facebook.ads.AudienceNetworkAds;

/* renamed from: com.facebook.ads.redexgen.X.9M  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9M implements AudienceNetworkAds.InitResult {
    public final String A00;
    public final boolean A01;

    public C9M(boolean z10, String str) {
        this.A01 = z10;
        this.A00 = str;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        return this.A00;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return this.A01;
    }
}
