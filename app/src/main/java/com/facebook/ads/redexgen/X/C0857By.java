package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.By  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0857By extends Thread {
    public final /* synthetic */ X0 A00;

    public C0857By(X0 x02) {
        this.A00 = x02;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
