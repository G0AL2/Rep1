package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1280Tf implements O0 {
    public final /* synthetic */ InterfaceC1110Mq A00;
    public final /* synthetic */ C1278Td A01;

    public C1280Tf(C1278Td c1278Td, InterfaceC1110Mq interfaceC1110Mq) {
        this.A01 = c1278Td;
        this.A00 = interfaceC1110Mq;
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABg(String str) {
        C1139Nt c1139Nt;
        c1139Nt = this.A01.A0A;
        c1139Nt.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABi(String str) {
        C1138Ns c1138Ns;
        this.A01.A05 = true;
        c1138Ns = this.A01.A09;
        c1138Ns.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABz(int i10) {
        boolean z10;
        C1139Nt c1139Nt;
        z10 = this.A01.A05;
        if (z10) {
            c1139Nt = this.A01.A0A;
            c1139Nt.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void AC4(String str) {
        C1138Ns c1138Ns;
        c1138Ns = this.A01.A09;
        c1138Ns.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void AC6() {
        this.A00.AAF(14);
    }
}
