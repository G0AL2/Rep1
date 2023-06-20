package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bX  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1549bX implements C7M {
    public final List<C1670da> A00;
    public final /* synthetic */ C1548bW A01;

    public C1549bX(C1548bW c1548bW, List<C1670da> list) {
        this.A01 = c1548bW;
        this.A00 = list;
    }

    private void A00() {
        C5Q c5q;
        C5Q c5q2;
        C5Q c5q3;
        C1400Xy c1400Xy;
        C5Q c5q4;
        C5Q c5q5;
        C1400Xy c1400Xy2;
        c5q = this.A01.A00;
        c5q.A05(true);
        c5q2 = this.A01.A00;
        c5q2.A02();
        c5q3 = this.A01.A00;
        c5q3.A03(0);
        for (C1670da c1670da : this.A00) {
            c1400Xy = this.A01.A01;
            K4 A0K = UB.A0K();
            c5q4 = this.A01.A00;
            UB ub2 = new UB(c1400Xy, c1670da, null, A0K, c5q4.A01());
            C1670da nativeAdapter = ub2.A0y();
            if (nativeAdapter != null) {
                C1670da nativeAdapter2 = ub2.A0y();
                if (nativeAdapter2.A0F() != null) {
                    C1670da nativeAdapter3 = ub2.A0y();
                    ((AbstractC1632cx) nativeAdapter3.A0F()).A00(ub2);
                }
            }
            c5q5 = this.A01.A00;
            c1400Xy2 = this.A01.A01;
            c5q5.A04(new NativeAd(c1400Xy2, ub2));
        }
        C1069Kz.A00(new C1550bY(this));
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        A00();
    }
}
