package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.1D */
/* loaded from: assets/audience_network.dex */
public class C1D implements Serializable {
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public C1W A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final C1D A0C(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1D A0D(int i10) {
        this.A01 = i10;
        return this;
    }

    public final C1D A0E(int i10) {
        this.A02 = i10;
        return this;
    }

    public final C1D A0F(int i10) {
        this.A03 = i10;
        return this;
    }

    public final C1D A0G(int i10) {
        this.A04 = i10;
        return this;
    }

    public final C1D A0H(long j10) {
        this.A05 = j10;
        return this;
    }

    public final C1D A0I(@Nullable C1W c1w) {
        this.A06 = c1w;
        return this;
    }

    public final C1D A0J(String str) {
        this.A07 = str;
        return this;
    }

    public final C1D A0K(String str) {
        this.A08 = str;
        return this;
    }

    public final C1D A0L(boolean z10) {
        this.A09 = z10;
        return this;
    }

    public final C1D A0M(boolean z10) {
        this.A0A = z10;
        return this;
    }

    public final C1D A0N(boolean z10) {
        this.A0B = z10;
        return this;
    }

    public final C1E A0O() {
        return new C1E(this);
    }
}
