package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class UO implements InterfaceC1045Jy {
    public WeakReference<UB> A00;

    public UO(UB ub2) {
        this.A00 = new WeakReference<>(ub2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1045Jy
    public final void ABk(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z10, false);
        }
    }
}
