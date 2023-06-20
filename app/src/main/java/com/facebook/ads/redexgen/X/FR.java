package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FR extends AbstractC1657dN {
    public final C1400Xy A00;

    public FR(C1A c1a, List<UB> list, C1400Xy c1400Xy) {
        super(c1a, list, c1400Xy);
        this.A00 = c1400Xy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C1277Tc A06(ViewGroup viewGroup, int i10) {
        return new C1277Tc(new C1116Mw(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1657dN, com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public final void A0E(C1277Tc c1277Tc, int i10) {
        super.A0E(c1277Tc, i10);
        C1116Mw c1116Mw = (C1116Mw) c1277Tc.A0l();
        N8 n82 = (N8) c1116Mw.getImageCardView();
        n82.setImageDrawable(null);
        A0F(n82, i10);
        UB ub2 = ((AbstractC1657dN) this).A01.get(i10);
        ub2.A11().A0F(this.A00);
        ub2.A1N(c1116Mw, c1116Mw);
    }
}
