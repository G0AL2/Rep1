package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.d9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1643d9 implements InterfaceC06975f {
    public final /* synthetic */ C05941d A00;

    public C1643d9(C05941d c05941d) {
        this.A00 = c05941d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA1() {
        InterfaceC05931c interfaceC05931c;
        interfaceC05931c = this.A00.A04;
        interfaceC05931c.A9v();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA2() {
        InterfaceC05931c interfaceC05931c;
        interfaceC05931c = this.A00.A04;
        interfaceC05931c.A9u(AdError.CACHE_ERROR);
    }
}
