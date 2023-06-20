package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class BP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ BS A03;

    public BP(BS bs, int i10, long j10, long j11) {
        this.A03 = bs;
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BT bt;
        if (L0.A02(this)) {
            return;
        }
        try {
            bt = this.A03.A01;
            bt.AA9(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
