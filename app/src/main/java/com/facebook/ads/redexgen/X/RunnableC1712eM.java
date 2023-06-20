package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.eM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1712eM implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1711eL A01;

    public RunnableC1712eM(C1711eL c1711eL, int i10) {
        this.A01 = c1711eL;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        SA sa2;
        Handler handler;
        Runnable runnable;
        if (L0.A02(this)) {
            return;
        }
        try {
            z10 = this.A01.A01;
            if (z10) {
                C1711eL c1711eL = this.A01;
                sa2 = this.A01.A05;
                c1711eL.A06(sa2.A9j());
                handler = this.A01.A04;
                runnable = this.A01.A09;
                handler.postDelayed(runnable, this.A00);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
