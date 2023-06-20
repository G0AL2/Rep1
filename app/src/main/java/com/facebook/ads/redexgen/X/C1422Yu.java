package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;

/* renamed from: com.facebook.ads.redexgen.X.Yu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1422Yu implements InterfaceC07386v {
    public final /* synthetic */ C1419Yr A00;

    public C1422Yu(C1419Yr c1419Yr) {
        this.A00 = c1419Yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        PowerManager powerManager;
        boolean A04;
        powerManager = this.A00.A00;
        if (powerManager != null && Build.VERSION.SDK_INT >= 7) {
            C1419Yr c1419Yr = this.A00;
            A04 = c1419Yr.A04();
            return c1419Yr.A0F(A04);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
