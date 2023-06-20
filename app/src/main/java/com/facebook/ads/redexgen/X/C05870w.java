package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05870w extends C2M implements K3 {
    public AI A00;
    @Nullable
    public List<C1172Pa> A01;

    public C05870w(C1400Xy c1400Xy) {
        super(c1400Xy);
        this.A00 = new AI(this, 1, null, null, null);
    }

    public final void A22(C1220Qw c1220Qw) {
        AI ai = this.A00;
        if (ai != null) {
            ai.A0d(c1220Qw);
        }
    }

    public AI getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0e(this.A01);
    }
}
