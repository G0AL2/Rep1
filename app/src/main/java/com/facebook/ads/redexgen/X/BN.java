package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class BN implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ BS A02;
    public final /* synthetic */ String A03;

    public BN(BS bs, String str, long j10, long j11) {
        this.A02 = bs;
        this.A03 = str;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BT bt;
        if (L0.A02(this)) {
            return;
        }
        try {
            bt = this.A02.A01;
            bt.AA4(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
