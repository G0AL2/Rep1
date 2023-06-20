package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.Xk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1386Xk extends L8 {
    public final /* synthetic */ C1399Xx A00;

    public C1386Xk(C1399Xx c1399Xx) {
        this.A00 = c1399Xx;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
