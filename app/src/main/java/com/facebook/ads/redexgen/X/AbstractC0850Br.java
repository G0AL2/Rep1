package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.facebook.ads.redexgen.X.Br  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0850Br {
    public int A00;

    public final void A00(int i10) {
        this.A00 |= i10;
    }

    public final void A01(int i10) {
        this.A00 &= i10 ^ (-1);
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final boolean A03() {
        return A06(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean A04() {
        return A06(4);
    }

    public final boolean A05() {
        return A06(1);
    }

    public final boolean A06(int i10) {
        return (this.A00 & i10) == i10;
    }

    public void A07() {
        this.A00 = 0;
    }
}
