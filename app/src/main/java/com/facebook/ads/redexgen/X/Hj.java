package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Hj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ V8 A03;

    public Hj(V8 v82, int i10, long j10, long j11) {
        this.A03 = v82;
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HY hy;
        if (L0.A02(this)) {
            return;
        }
        try {
            hy = this.A03.A07;
            hy.AAB(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
