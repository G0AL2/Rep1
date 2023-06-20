package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class C4 implements Runnable {
    public final /* synthetic */ C9 A00;
    public final /* synthetic */ CA A01;

    public C4(C9 c92, CA ca2) {
        this.A00 = c92;
        this.A01 = ca2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.AAa();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
