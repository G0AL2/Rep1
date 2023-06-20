package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class PP {
    @Nullable
    public String A02;
    @Nullable
    public String A03;
    public final C1I A04;
    public final C1U A05;
    public final C1400Xy A06;
    public C1K A01 = C1K.A01(null);
    public int A00 = 1000;

    public PP(C1400Xy c1400Xy, C1I c1i, C1U c1u) {
        this.A06 = c1400Xy;
        this.A04 = c1i;
        this.A05 = c1u;
    }

    public static /* synthetic */ int A00(PP pp) {
        return pp.A00;
    }

    public static /* synthetic */ C1I A01(PP pp) {
        return pp.A04;
    }

    public static /* synthetic */ C1K A02(PP pp) {
        return pp.A01;
    }

    public static /* synthetic */ C1U A03(PP pp) {
        return pp.A05;
    }

    public static /* synthetic */ C1400Xy A04(PP pp) {
        return pp.A06;
    }

    public static /* synthetic */ String A05(PP pp) {
        return pp.A03;
    }

    public static /* synthetic */ String A06(PP pp) {
        return pp.A02;
    }

    public final PP A07(int i10) {
        this.A00 = i10;
        return this;
    }

    public final PP A08(C1K c1k) {
        this.A01 = c1k;
        return this;
    }

    public final PP A09(String str) {
        this.A02 = str;
        return this;
    }

    public final PP A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final PR A0B() {
        return new PR(this, null);
    }
}
