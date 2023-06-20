package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;

/* renamed from: com.facebook.ads.redexgen.X.Yt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1421Yt implements InterfaceC07386v {
    public final /* synthetic */ C1419Yr A00;

    public C1421Yt(C1419Yr c1419Yr) {
        this.A00 = c1419Yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        PowerManager powerManager;
        PowerManager powerManager2;
        if (Build.VERSION.SDK_INT >= 23) {
            powerManager = this.A00.A00;
            if (powerManager != null) {
                C1419Yr c1419Yr = this.A00;
                powerManager2 = c1419Yr.A00;
                return c1419Yr.A0F(powerManager2.isDeviceIdleMode());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
