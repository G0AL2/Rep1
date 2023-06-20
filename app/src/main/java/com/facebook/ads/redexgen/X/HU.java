package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class HU {
    public final int A00;
    public final HR A01;
    @Nullable
    public final Object A02;
    public final C0829Av[] A03;

    public HU(C0829Av[] c0829AvArr, HQ[] hqArr, @Nullable Object obj) {
        this.A03 = c0829AvArr;
        this.A01 = new HR(hqArr);
        this.A02 = obj;
        this.A00 = c0829AvArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(HU hu) {
        if (hu == null || hu.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i10 = 0; i10 < this.A01.A01; i10++) {
            if (!A02(hu, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(HU hu, int i10) {
        return hu != null && C1020Iz.A0g(this.A03[i10], hu.A03[i10]) && C1020Iz.A0g(this.A01.A00(i10), hu.A01.A00(i10));
    }
}
