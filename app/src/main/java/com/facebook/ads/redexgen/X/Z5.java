package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class Z5 implements InterfaceC07386v {
    public final /* synthetic */ C1423Yv A00;

    public Z5(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        PackageManager packageManager;
        PackageManager packageManager2;
        if (Build.VERSION.SDK_INT >= 26) {
            packageManager = this.A00.A02;
            if (packageManager != null) {
                C1423Yv c1423Yv = this.A00;
                packageManager2 = c1423Yv.A02;
                return c1423Yv.A0F(packageManager2.canRequestPackageInstalls());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
