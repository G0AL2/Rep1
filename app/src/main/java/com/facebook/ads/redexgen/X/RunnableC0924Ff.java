package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ff  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0924Ff implements Runnable {
    public final /* synthetic */ C0930Fl A00;
    public final /* synthetic */ C0931Fm A01;
    public final /* synthetic */ C0932Fn A02;
    public final /* synthetic */ InterfaceC0933Fo A03;

    public RunnableC0924Ff(C0930Fl c0930Fl, InterfaceC0933Fo interfaceC0933Fo, C0931Fm c0931Fm, C0932Fn c0932Fn) {
        this.A00 = c0930Fl;
        this.A03 = interfaceC0933Fo;
        this.A01 = c0931Fm;
        this.A02 = c0932Fn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A03.ABE(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
