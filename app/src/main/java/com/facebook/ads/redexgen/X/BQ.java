package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class BQ implements Runnable {
    public final /* synthetic */ BS A00;
    public final /* synthetic */ C0855Bw A01;

    public BQ(BS bs, C0855Bw c0855Bw) {
        this.A00 = bs;
        this.A01 = c0855Bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BT bt;
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            bt = this.A00.A01;
            bt.AA5(this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
