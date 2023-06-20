package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Fc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0921Fc implements Runnable {
    public final /* synthetic */ C0930Fl A00;
    public final /* synthetic */ InterfaceC0933Fo A01;

    public RunnableC0921Fc(C0930Fl c0930Fl, InterfaceC0933Fo interfaceC0933Fo) {
        this.A00 = c0930Fl;
        this.A01 = interfaceC0933Fo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.ABV(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
