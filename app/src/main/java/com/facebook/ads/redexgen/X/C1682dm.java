package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.dm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1682dm extends L8 {
    public final /* synthetic */ C05850u A00;

    public C1682dm(C05850u c05850u) {
        this.A00 = c05850u;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C05840t c05840t;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c05840t = this.A00.A02;
        c05840t.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
