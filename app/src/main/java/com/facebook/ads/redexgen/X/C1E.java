package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.1E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1E implements Serializable {
    public static final long serialVersionUID = -268645651038092386L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    @Nullable
    public final C1W A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C1E(C1D c1d) {
        this.A08 = C1D.A07(c1d);
        this.A05 = C1D.A05(c1d);
        this.A03 = C1D.A01(c1d);
        this.A04 = C1D.A02(c1d);
        this.A0A = C1D.A0A(c1d);
        this.A09 = C1D.A0B(c1d);
        this.A07 = C1D.A08(c1d);
        this.A01 = C1D.A03(c1d);
        this.A00 = C1D.A04(c1d);
        this.A06 = C1D.A06(c1d);
        this.A02 = C1D.A00(c1d);
        this.A0B = C1D.A09(c1d);
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A03;
    }

    public final int A04() {
        return this.A04;
    }

    public final long A05() {
        return this.A05;
    }

    @Nullable
    public final C1W A06() {
        return this.A06;
    }

    public final String A07() {
        return this.A07;
    }

    public final String A08() {
        return this.A08;
    }

    public final boolean A09() {
        return this.A09;
    }

    public final boolean A0A() {
        return this.A0B;
    }
}
