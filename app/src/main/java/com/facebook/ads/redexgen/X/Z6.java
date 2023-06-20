package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class Z6 implements InterfaceC07386v {
    public static String[] A01 = {"eOUuWViEzFdpoMILAqmgKfGD", "kQ8zGky5wq3o9AT", "ncGQnuO4sM8XFQVxbr6Mt1Vf36DFujo3", "a4nYvm2BizGaG1Ug1SxTpBLIw0WxQ6vz", "jAlZY9MHNrHTDDv2DRP1sCieuZx8QBhv", "RCRcS7R4oQOTyLjlpIEX5API7Ni0gnf1", "stcG16G11KY1ooFu5mTwbs8KzP9kRkND", "k7goAJY4JhsqFIUQ56a5dCg3eq5QWQcp"};
    public final /* synthetic */ C1423Yv A00;

    public Z6(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        PackageManager packageManager;
        PackageManager packageManager2;
        PackageManager packageManager3;
        PackageManager packageManager4;
        if (Build.VERSION.SDK_INT >= 26) {
            packageManager = this.A00.A02;
            if (packageManager != null) {
                packageManager2 = this.A00.A02;
                if (packageManager2.getPackageInstaller() != null) {
                    packageManager3 = this.A00.A02;
                    if (packageManager3.getPackageInstaller().getSessionInfo(0) != null) {
                        C1423Yv c1423Yv = this.A00;
                        packageManager4 = c1423Yv.A02;
                        return c1423Yv.A04(packageManager4.getPackageInstaller().getSessionInfo(0).getInstallReason());
                    }
                }
            }
            C1423Yv c1423Yv2 = this.A00;
            AnonymousClass76 anonymousClass76 = AnonymousClass76.A07;
            if (A01[4].charAt(16) != 'D') {
                throw new RuntimeException();
            }
            A01[4] = "aumDgxyAyTkwYeibDzhpdrzSDvCJmfPb";
            return c1423Yv2.A07(anonymousClass76);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
