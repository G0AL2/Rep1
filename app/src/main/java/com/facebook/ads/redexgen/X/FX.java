package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FX extends AbstractC1657dN {
    public final C1400Xy A00;
    public final K7 A01;

    public FX(C1400Xy c1400Xy, C1A c1a, List<UB> list, @Nullable K7 k72) {
        super(c1a, list, c1400Xy);
        this.A00 = c1400Xy;
        this.A01 = k72 == null ? new K7() : k72;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01 */
    public final C1277Tc A06(ViewGroup viewGroup, int i10) {
        return new C1277Tc(new C1112Ms(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1657dN, com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public final void A0E(C1277Tc c1277Tc, int i10) {
        super.A0E(c1277Tc, i10);
        C1112Ms c1112Ms = (C1112Ms) c1277Tc.A0l();
        A0F(c1112Ms.getImageCardView(), i10);
        if (((AbstractC1657dN) this).A01.get(i10) != null) {
            c1112Ms.setTitle(((AbstractC1657dN) this).A01.get(i10).getAdHeadline());
            c1112Ms.setSubtitle(((AbstractC1657dN) this).A01.get(i10).getAdLinkDescription());
            c1112Ms.setButtonText(((AbstractC1657dN) this).A01.get(i10).getAdCallToAction());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1112Ms);
        ((AbstractC1657dN) this).A01.get(i10).A1O(c1112Ms, c1112Ms, arrayList);
    }
}
