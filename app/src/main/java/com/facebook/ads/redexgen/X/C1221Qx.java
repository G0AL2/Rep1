package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1221Qx {
    public float A00;
    public C0Q A01;
    public Map<String, String> A02;

    public C1221Qx(C0Q c0q) {
        this(c0q, 0.0f);
    }

    public C1221Qx(C0Q c0q, float f10) {
        this(c0q, f10, null);
    }

    public C1221Qx(C0Q c0q, float f10, Map<String, String> map) {
        this.A01 = c0q;
        this.A00 = f10;
        if (map != null) {
            this.A02 = map;
            return;
        }
        Map<String, String> windowParams = new HashMap<>();
        this.A02 = windowParams;
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A02();
    }

    public final C0Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == C0Q.A0J;
    }
}
