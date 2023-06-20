package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Eu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0913Eu implements Runnable {
    public final /* synthetic */ RunnableC0916Ex A00;

    public RunnableC0913Eu(RunnableC0916Ex runnableC0916Ex) {
        this.A00 = runnableC0916Ex;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
