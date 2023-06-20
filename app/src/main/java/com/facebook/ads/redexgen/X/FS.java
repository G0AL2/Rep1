package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class FS implements Runnable {
    public final /* synthetic */ CE A00;

    public FS(CE ce2) {
        this.A00 = ce2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
