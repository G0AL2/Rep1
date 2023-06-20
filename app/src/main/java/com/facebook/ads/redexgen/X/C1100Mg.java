package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Mg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1100Mg {
    @Nullable
    public static C1100Mg A02;
    public final C1282Th A00;
    public final C1102Mi A01;

    public C1100Mg(C1400Xy c1400Xy, Executor executor, C9H c9h) {
        this.A01 = new C1102Mi(c1400Xy);
        this.A00 = new C1282Th(executor, c9h, c1400Xy);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1400Xy c1400Xy, Executor executor, C9H c9h) {
        if (!JR.A10(c1400Xy)) {
            return;
        }
        C1100Mg c1100Mg = A02;
        if (c1100Mg == null) {
            A02 = new C1100Mg(c1400Xy, executor, c9h);
            A02.A00();
            return;
        }
        c1100Mg.A02(c9h);
    }

    private void A02(C9H c9h) {
        this.A00.A07(c9h);
    }
}
