package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Fj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0928Fj implements Runnable {
    public final /* synthetic */ C0930Fl A00;
    public final /* synthetic */ C0932Fn A01;
    public final /* synthetic */ InterfaceC0933Fo A02;

    public RunnableC0928Fj(C0930Fl c0930Fl, InterfaceC0933Fo interfaceC0933Fo, C0932Fn c0932Fn) {
        this.A00 = c0930Fl;
        this.A02 = interfaceC0933Fo;
        this.A01 = c0932Fn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A02.AAZ(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
