package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class SO implements OF {
    public final /* synthetic */ C9D A00;

    public SO(C9D c9d) {
        this.A00 = c9d;
    }

    @Override // com.facebook.ads.redexgen.X.OF
    public final void AAx(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z10);
        this.A00.A05();
    }
}
