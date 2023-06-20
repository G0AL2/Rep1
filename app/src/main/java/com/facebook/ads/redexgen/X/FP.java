package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class FP extends d2 {
    public FP(C1400Xy c1400Xy, C06061p c06061p) {
        super(c1400Xy, c06061p);
    }

    private InterfaceC05880x A00(Runnable runnable) {
        return new C1635d0(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0J() {
        ((C1672dc) this.A01).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0L(InterfaceC05780n interfaceC05780n, C9H c9h, C9F c9f, C06071q c06071q) {
        C1672dc c1672dc = (C1672dc) interfaceC05780n;
        C1636d1 c1636d1 = new C1636d1(this, c06071q, c1672dc);
        A0C().postDelayed(c1636d1, c9h.A05().A05());
        c1672dc.A0A(this.A0B, A00(c1636d1), c06071q, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }

    public final AnonymousClass18 A0T() {
        return ((C1672dc) this.A01).A09();
    }
}
