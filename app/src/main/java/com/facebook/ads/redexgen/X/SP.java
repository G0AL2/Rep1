package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class SP implements AnonymousClass57 {
    public final /* synthetic */ C9D A00;

    public SP(C9D c9d) {
        this.A00 = c9d;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass57
    public final boolean A8M() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        return !atomicBoolean.get() || this.A00.A0T();
    }
}
