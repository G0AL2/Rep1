package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Go  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0959Go {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<C0960Gp> A09;
    public final boolean A0A;

    public C0959Go(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<C0960Gp> sparseArray) {
        this.A03 = i10;
        this.A0A = z10;
        this.A08 = i11;
        this.A02 = i12;
        this.A04 = i13;
        this.A01 = i14;
        this.A00 = i15;
        this.A07 = i16;
        this.A06 = i17;
        this.A05 = i18;
        this.A09 = sparseArray;
    }

    public final void A00(C0959Go c0959Go) {
        if (c0959Go == null) {
            return;
        }
        SparseArray<C0960Gp> sparseArray = c0959Go.A09;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            this.A09.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
        }
    }
}
