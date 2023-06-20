package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public class JH implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ JM A01;

    public JH(JM jm, Format format) {
        this.A01 = jm;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JN jn;
        if (L0.A02(this)) {
            return;
        }
        try {
            jn = this.A01.A01;
            jn.ACl(this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
