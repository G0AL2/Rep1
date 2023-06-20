package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class T7 extends L8 {
    public final WeakReference<C1220Qw> A00;

    public T7(C1220Qw c1220Qw) {
        this.A00 = new WeakReference<>(c1220Qw);
    }

    public T7(WeakReference<C1220Qw> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C1220Qw c1220Qw = this.A00.get();
        if (c1220Qw != null) {
            c1220Qw.A0U();
        }
    }
}
