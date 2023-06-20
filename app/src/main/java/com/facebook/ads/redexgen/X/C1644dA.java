package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.dA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1644dA implements InterfaceC06021l {
    public final /* synthetic */ C05941d A00;

    public C1644dA(C05941d c05941d) {
        this.A00 = c05941d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06021l
    public final void ABm(AdError adError) {
        InterfaceC05931c interfaceC05931c;
        interfaceC05931c = this.A00.A04;
        interfaceC05931c.A9u(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06021l
    public final void ABn() {
        InterfaceC05931c interfaceC05931c;
        interfaceC05931c = this.A00.A04;
        interfaceC05931c.A9v();
    }
}
