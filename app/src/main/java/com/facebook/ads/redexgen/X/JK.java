package com.facebook.ads.redexgen.X;

import android.view.Surface;

/* loaded from: assets/audience_network.dex */
public class JK implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ JM A01;

    public JK(JM jm, Surface surface) {
        this.A01 = jm;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JN jn;
        if (L0.A02(this)) {
            return;
        }
        try {
            jn = this.A01.A01;
            jn.AC7(this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
