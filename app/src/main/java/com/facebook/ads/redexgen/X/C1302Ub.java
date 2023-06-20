package com.facebook.ads.redexgen.X;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.facebook.ads.redexgen.X.Ub  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1302Ub extends L8 {
    public final /* synthetic */ C1301Ua A00;

    public C1302Ub(C1301Ua c1301Ua) {
        this.A00 = c1301Ua;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (threadPoolExecutor.getQueue().isEmpty()) {
            threadPoolExecutor2 = this.A00.A0B;
            runnable = this.A00.A0A;
            threadPoolExecutor2.execute(runnable);
        }
    }
}
