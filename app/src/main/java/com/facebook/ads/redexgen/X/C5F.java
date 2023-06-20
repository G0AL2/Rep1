package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* renamed from: com.facebook.ads.redexgen.X.5F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5F implements BidderTokenProviderApi {
    public final AnonymousClass67 A00 = new AnonymousClass67();

    public final AnonymousClass67 A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C5G.A07(context));
    }
}
