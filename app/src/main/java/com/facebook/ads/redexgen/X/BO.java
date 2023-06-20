package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public class BO implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ BS A01;

    public BO(BS bs, Format format) {
        this.A01 = bs;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BT bt;
        if (L0.A02(this)) {
            return;
        }
        try {
            bt = this.A01.A01;
            bt.AA7(this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
