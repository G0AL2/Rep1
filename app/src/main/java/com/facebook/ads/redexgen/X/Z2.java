package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class Z2 implements InterfaceC07386v {
    public final /* synthetic */ C1423Yv A00;

    public Z2(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        PackageInfo packageInfo3;
        packageInfo = this.A00.A01;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                C1423Yv c1423Yv = this.A00;
                packageInfo3 = c1423Yv.A01;
                return c1423Yv.A06(packageInfo3.getLongVersionCode());
            }
            C1423Yv c1423Yv2 = this.A00;
            packageInfo2 = c1423Yv2.A01;
            return c1423Yv2.A04(packageInfo2.versionCode);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
