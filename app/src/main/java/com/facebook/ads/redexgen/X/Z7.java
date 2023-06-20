package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;

/* loaded from: assets/audience_network.dex */
public class Z7 implements InterfaceC07386v {
    public final /* synthetic */ C1423Yv A00;

    public Z7(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        PackageManager packageManager;
        PackageManager packageManager2;
        packageManager = this.A00.A02;
        if (packageManager != null) {
            C1423Yv c1423Yv = this.A00;
            packageManager2 = c1423Yv.A02;
            return c1423Yv.A0F(packageManager2.isSafeMode());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
