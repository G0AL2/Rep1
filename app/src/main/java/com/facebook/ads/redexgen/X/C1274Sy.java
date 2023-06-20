package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Sy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1274Sy implements OF {
    public final WeakReference<AB> A00;

    public C1274Sy(AB ab2) {
        this.A00 = new WeakReference<>(ab2);
    }

    public /* synthetic */ C1274Sy(AB ab2, AH ah) {
        this(ab2);
    }

    @Override // com.facebook.ads.redexgen.X.OF
    public final void AAx(boolean z10) {
        AB ab2 = this.A00.get();
        if (ab2 != null) {
            ab2.A04 = z10;
            ab2.A02();
        }
    }
}
