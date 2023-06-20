package com.facebook.ads.redexgen.X;

import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Yk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1412Yk implements InterfaceC07386v {
    public final /* synthetic */ C1410Yi A00;

    public C1412Yk(C1410Yi c1410Yi) {
        this.A00 = c1410Yi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        return this.A00.A03(((float) SystemClock.elapsedRealtime()) / 1000.0f);
    }
}
