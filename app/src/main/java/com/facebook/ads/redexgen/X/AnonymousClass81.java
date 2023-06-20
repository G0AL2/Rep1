package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.81  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass81 extends AbstractC1079Lj {
    public final /* synthetic */ KX A00;

    public AnonymousClass81(KX kx) {
        this.A00 = kx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC07859c
    /* renamed from: A00 */
    public final void A03(C1092Ly c1092Ly) {
        if (KX.A07(this.A00) && KX.A08(this.A00)) {
            KX.A0B(this.A00, false);
            if (KX.A0A(this.A00, QS.A04) || KX.A09(this.A00)) {
                KX.A0C(this.A00, false);
                KX.A01(this.A00).postDelayed(new KZ(this), KX.A00(this.A00));
            } else if (!KX.A0A(this.A00, QS.A03)) {
            } else {
                KX.A04(this.A00);
                KX.A05(this.A00, true, true);
            }
        }
    }
}
