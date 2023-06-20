package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FT implements Runnable {
    public final /* synthetic */ CE A00;

    public FT(CE ce2) {
        this.A00 = ce2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        VX vx;
        if (L0.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0G;
            if (!z10) {
                vx = this.A00.A08;
                vx.AAP(this.A00);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
