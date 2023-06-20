package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class ZR implements InterfaceC07386v {
    public final /* synthetic */ ZN A00;

    public ZR(ZN zn) {
        this.A00 = zn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        KeyguardManager keyguardManager;
        KeyguardManager keyguardManager2;
        if (Build.VERSION.SDK_INT >= 22) {
            keyguardManager = this.A00.A00;
            if (keyguardManager == null) {
                return this.A00.A07(AnonymousClass76.A07);
            }
            ZN zn = this.A00;
            keyguardManager2 = zn.A00;
            return zn.A0F(keyguardManager2.isDeviceLocked());
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
