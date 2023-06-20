package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class VK implements GY {
    public final C0966Gv A00;
    public final Map<String, H1> A01;
    public final Map<String, C0967Gw> A02;
    public final long[] A03;

    public VK(C0966Gv c0966Gv, Map<String, H1> map, Map<String, C0967Gw> map2) {
        Map<String, H1> emptyMap;
        this.A00 = c0966Gv;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c0966Gv.A0F();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6B(long j10) {
        return this.A00.A0D(j10, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6b(int i10) {
        return this.A03[i10];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6c() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A70(long j10) {
        int A0A = C1020Iz.A0A(this.A03, j10, false, false);
        if (A0A < this.A03.length) {
            return A0A;
        }
        return -1;
    }
}
