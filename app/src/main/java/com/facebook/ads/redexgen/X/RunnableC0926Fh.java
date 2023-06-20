package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Fh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0926Fh implements Runnable {
    public final /* synthetic */ C0930Fl A00;
    public final /* synthetic */ InterfaceC0933Fo A01;

    public RunnableC0926Fh(C0930Fl c0930Fl, InterfaceC0933Fo interfaceC0933Fo) {
        this.A00 = c0930Fl;
        this.A01 = interfaceC0933Fo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.AC3(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
