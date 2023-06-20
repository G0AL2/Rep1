package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.Yd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1405Yd implements InterfaceC07386v {
    public static String[] A01 = {"z8dx8jcAs7HM5esb7c49HgQlCMJUD3t9", "Z27XjLV71jIj1KfRNg7i9pb54cjqos2V", "6E0WXe0HHFnnwQetVOp4LyZJXKm0EhYW", "5n0zxjSh5lrA6YdkKKdKdPto", "m3yiGl3d5h8kg9DGPr7qvl1tLoj9C1EY", "6Zd3QoWt03yEzQBhZFxcVO7q01Uelitn", "t47YK6eEHNb1t1eyBeM4t0RbN9Ph57Vj", "OvhOKFZHGYEQ5NA3UMfcxvSqe0D108CD"};
    public final /* synthetic */ YR A00;

    public C1405Yd(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            YR yr = this.A00;
            if (A01[6].charAt(15) != 'y') {
                throw new RuntimeException();
            }
            A01[6] = "Ct76XBGNMfDXyoQyHbEHQKjczjA9HjKg";
            telephonyManager2 = yr.A00;
            return yr.A04(telephonyManager2.getSimState());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
