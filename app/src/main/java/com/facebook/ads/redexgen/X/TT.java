package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class TT implements PQ {
    public final /* synthetic */ TO A00;

    public TT(TO to) {
        this.A00 = to;
    }

    @Override // com.facebook.ads.redexgen.X.PQ
    public final void ABA() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A0R;
        atomicBoolean.set(true);
        this.A00.A0N();
    }
}
