package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class JI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ JM A02;

    public JI(JM jm, int i10, long j10) {
        this.A02 = jm;
        this.A00 = i10;
        this.A01 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JN jn;
        if (L0.A02(this)) {
            return;
        }
        try {
            jn = this.A02.A01;
            jn.AAe(this.A00, this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
