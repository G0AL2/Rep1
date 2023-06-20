package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Xc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1378Xc implements C8X {
    public final C8U A00;

    public AbstractC1378Xc(C8U c8u) {
        this.A00 = c8u;
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    public final Map<String, String> A4T() {
        return C9Q.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    public final Map<String, String> A5i() {
        return AnonymousClass98.A02();
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    @Nullable
    public final String A6q() {
        return AnonymousClass98.A00();
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    public final String A6s() {
        return C07105s.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.X.C8X
    public final boolean A8V() {
        return LT.A00().A03();
    }
}
