package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.dD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1647dD implements InterfaceC06975f {
    public final /* synthetic */ C05941d A00;
    public final /* synthetic */ C1400Xy A01;
    public final /* synthetic */ boolean A02;

    public C1647dD(C05941d c05941d, C1400Xy c1400Xy, boolean z10) {
        this.A00 = c05941d;
        this.A01 = c1400Xy;
        this.A02 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA1() {
        InterfaceC05931c interfaceC05931c;
        C1653dJ c1653dJ;
        if (!JR.A1A(this.A01) || !this.A02) {
            interfaceC05931c = this.A00.A04;
            interfaceC05931c.A9v();
            return;
        }
        C05941d c05941d = this.A00;
        C1400Xy c1400Xy = this.A01;
        c1653dJ = c05941d.A03;
        c05941d.A02 = PB.A01(c1400Xy, c1653dJ, 1, new C1648dE(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA2() {
        InterfaceC05931c interfaceC05931c;
        interfaceC05931c = this.A00.A04;
        interfaceC05931c.A9u(AdError.CACHE_ERROR);
    }
}
