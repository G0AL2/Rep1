package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class HK implements InterfaceC1226Rc {
    @Override // com.facebook.ads.redexgen.X.InterfaceC1226Rc
    public final long A4f() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1226Rc
    public final void AEu(Object obj, long j10) throws InterruptedException {
        obj.wait(j10);
    }
}
