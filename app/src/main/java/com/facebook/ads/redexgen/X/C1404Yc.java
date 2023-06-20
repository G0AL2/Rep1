package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.Yc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1404Yc implements InterfaceC07386v {
    public static String[] A01 = {"Zr9pMbCXDOnIQia1rxNbs", "xgHdKmUla89dgoNlEUmYBSdthljERTVN", "t0eJ9CzsilrQTJZ3mBY5uHdLOToWpPD0", "xn7Df6Bsn6N8b", "nuXOesuXOGqaff6jWjDzzwB48Mr7m9Ru", "HD4PNhpjIErL9f7FhF1L2XB0w8jmfy8z", "GFJMAbd7JtPv78Iw3eZ5GKABpr6j7C", "a6D5eDw1EZzTAa7WvhZLV0FGc6KUpGTS"};
    public final /* synthetic */ YR A00;

    public C1404Yc(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    @SuppressLint({"MissingPermission"})
    public final C7A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        int A012;
        if (Build.VERSION.SDK_INT < 17) {
            return this.A00.A07(AnonymousClass76.A05);
        }
        boolean A0D = C7J.A0D();
        if (A01[2].charAt(7) != 's') {
            throw new RuntimeException();
        }
        A01[4] = "7cAAgCcjwnswSonydGODzEoLsKghCJb5";
        if (A0D) {
            boolean A0C = C7J.A0C();
            if (A01[1].charAt(23) == 'I') {
                throw new RuntimeException();
            }
            A01[7] = "A1O8dvsw8NjieGbBncMIJ1M47KAaXmaM";
            if (A0C) {
                return this.A00.A07(AnonymousClass76.A07);
            }
        }
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            YR yr = this.A00;
            telephonyManager2 = yr.A00;
            A012 = YR.A01(telephonyManager2.getAllCellInfo().get(0));
            return yr.A04(A012);
        }
        YR yr2 = this.A00;
        AnonymousClass76 anonymousClass76 = AnonymousClass76.A07;
        String[] strArr = A01;
        if (strArr[3].length() != strArr[6].length()) {
            String[] strArr2 = A01;
            strArr2[3] = "coCM9MFponCPc";
            strArr2[6] = "NV1iD8UH9ErBba9OnjbAeyrfSpL8qw";
            return yr2.A07(anonymousClass76);
        }
        return yr2.A07(anonymousClass76);
    }
}
