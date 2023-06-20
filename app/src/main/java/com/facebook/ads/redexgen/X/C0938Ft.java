package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ft  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0938Ft {
    @Nullable
    public C0938Ft A00;
    @Nullable
    public HV A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C0938Ft(long j10, int i10) {
        this.A04 = j10;
        this.A03 = i10 + j10;
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A04)) + this.A01.A00;
    }

    public final C0938Ft A01() {
        this.A01 = null;
        C0938Ft c0938Ft = this.A00;
        this.A00 = null;
        return c0938Ft;
    }

    public final void A02(HV hv, C0938Ft c0938Ft) {
        this.A01 = hv;
        this.A00 = c0938Ft;
        this.A02 = true;
    }
}
