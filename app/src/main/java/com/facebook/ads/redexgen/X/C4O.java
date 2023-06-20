package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4O  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4O {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C4O A00(AbstractC06774l abstractC06774l, int i10) {
        View view = abstractC06774l.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C4O A01(AbstractC06774l abstractC06774l) {
        return A00(abstractC06774l, 0);
    }
}
