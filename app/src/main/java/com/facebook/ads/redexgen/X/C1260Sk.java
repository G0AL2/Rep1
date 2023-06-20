package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Sk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1260Sk implements OF {
    public final WeakReference<A3> A00;

    public C1260Sk(A3 a32) {
        this.A00 = new WeakReference<>(a32);
    }

    public /* synthetic */ C1260Sk(A3 a32, A8 a82) {
        this(a32);
    }

    @Override // com.facebook.ads.redexgen.X.OF
    public final void AAx(boolean z10) {
        A3 a32 = this.A00.get();
        if (a32 != null) {
            a32.A06 = z10;
            a32.A01();
        }
    }
}
