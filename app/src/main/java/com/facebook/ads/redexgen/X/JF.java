package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class JF implements Runnable {
    public final /* synthetic */ C0855Bw A00;
    public final /* synthetic */ JM A01;

    public JF(JM jm, C0855Bw c0855Bw) {
        this.A01 = jm;
        this.A00 = c0855Bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JN jn;
        if (L0.A02(this)) {
            return;
        }
        try {
            jn = this.A01.A01;
            jn.ACi(this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
