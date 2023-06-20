package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VM implements GY {
    public final long[] A00;
    public final GX[] A01;

    public VM(GX[] gxArr, long[] jArr) {
        this.A01 = gxArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6B(long j10) {
        int A0B = C1020Iz.A0B(this.A00, j10, true, false);
        if (A0B != -1) {
            GX[] gxArr = this.A01;
            if (gxArr[A0B] != null) {
                return Collections.singletonList(gxArr[A0B]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6b(int i10) {
        boolean z10 = true;
        IK.A03(i10 >= 0);
        if (i10 >= this.A00.length) {
            z10 = false;
        }
        IK.A03(z10);
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6c() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A70(long j10) {
        int A0A = C1020Iz.A0A(this.A00, j10, false, false);
        if (A0A < this.A00.length) {
            return A0A;
        }
        return -1;
    }
}
