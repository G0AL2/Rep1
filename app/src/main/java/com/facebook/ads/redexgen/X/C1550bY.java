package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1550bY extends AbstractRunnableC1065Kv {
    public final /* synthetic */ C1549bX A00;

    public C1550bY(C1549bX c1549bX) {
        this.A00 = c1549bX;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1065Kv
    public final void A01() {
        C5Q c5q;
        C5Q c5q2;
        c5q = this.A00.A01.A00;
        if (c5q.A00() != null) {
            c5q2 = this.A00.A01.A00;
            c5q2.A00().onAdsLoaded();
        }
    }
}
