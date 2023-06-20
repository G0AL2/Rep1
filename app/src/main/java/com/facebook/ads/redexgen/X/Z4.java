package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;

/* loaded from: assets/audience_network.dex */
public class Z4 implements InterfaceC07386v {
    public final /* synthetic */ C1423Yv A00;

    public Z4(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        packageInfo = this.A00.A01;
        if (packageInfo != null) {
            C1423Yv c1423Yv = this.A00;
            packageInfo2 = c1423Yv.A01;
            return c1423Yv.A06(packageInfo2.firstInstallTime);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
