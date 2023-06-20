package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1551bZ extends AbstractRunnableC1065Kv {
    public final /* synthetic */ C1548bW A00;
    public final /* synthetic */ KH A01;

    public C1551bZ(C1548bW c1548bW, KH kh) {
        this.A00 = c1548bW;
        this.A01 = kh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1065Kv
    public final void A01() {
        C5Q c5q;
        C5Q c5q2;
        c5q = this.A00.A00;
        if (c5q.A00() != null) {
            c5q2 = this.A00.A00;
            c5q2.A00().onAdError(C1073Ld.A00(this.A01));
        }
    }
}
