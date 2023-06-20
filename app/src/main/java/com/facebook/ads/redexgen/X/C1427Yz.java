package com.facebook.ads.redexgen.X;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Yz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1427Yz implements InterfaceC07386v {
    public static String[] A01 = {"zJajY9dZZxYFsLRzsvnBiwQWt0HnizLC", "gzFaheVOcPUMbI38nwUIVYmc91b5uR", "ce0KJPPQByTAaQ9ATxZk2kwW24DeaJ9j", "R6Wiv8wmYaZdmPdgU3hXsutSf", "job2ys34errF3to", "kwK9VFGEGX8wPEd", "j3AidPNHk3dBWfN6HPyZ7", "rfM1O6R1RyyEf1DP"};
    public final /* synthetic */ C1423Yv A00;

    public C1427Yz(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        packageInfo = this.A00.A01;
        if (packageInfo != null && Build.VERSION.SDK_INT >= 22) {
            C1423Yv c1423Yv = this.A00;
            if (A01[1].length() != 30) {
                throw new RuntimeException();
            }
            A01[6] = "SsABSdrOWb5CHUfmSefeH";
            packageInfo2 = c1423Yv.A01;
            return c1423Yv.A04(packageInfo2.baseRevisionCode);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
