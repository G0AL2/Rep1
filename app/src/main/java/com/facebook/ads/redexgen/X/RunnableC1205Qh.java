package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1205Qh implements Runnable {
    public final /* synthetic */ C1208Qk A00;

    public RunnableC1205Qh(C1208Qk c1208Qk) {
        this.A00 = c1208Qk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            handler = this.A00.A04;
            handler.removeCallbacks(this);
            handler2 = this.A00.A04;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
