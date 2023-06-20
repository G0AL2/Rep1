package com.facebook.ads.redexgen.X;

import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VO implements GY {
    public final List<GX> A00;

    public VO(List<GX> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6B(long j10) {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6b(int i10) {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6c() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A70(long j10) {
        return -1;
    }
}
