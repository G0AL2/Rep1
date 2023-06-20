package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class O7 implements Runnable {
    public final /* synthetic */ O8 A00;
    public final /* synthetic */ O9 A01;

    public O7(O8 o82, O9 o92) {
        this.A00 = o82;
        this.A01 = o92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.AA3();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
