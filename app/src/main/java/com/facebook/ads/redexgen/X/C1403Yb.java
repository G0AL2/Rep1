package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.Yb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1403Yb implements InterfaceC07386v {
    public static String[] A01 = {"xn6Y4xiAj5nTE1ZX0fcI9", "IuzZJNTC9Fpz", "Zp9uFgGuFlryeSNHyo4T0p", "eRJH2gjtevDtLFu1wMxFEv", "pTKacr9NdWTXHSX", "3c0ViuxMUKEAC", "2WDSEnCYP4spNEJs", "S3q5Kz3J"};
    public final /* synthetic */ YR A00;

    public C1403Yb(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        if (Build.VERSION.SDK_INT >= 26) {
            telephonyManager = this.A00.A00;
            if (telephonyManager != null) {
                YR yr = this.A00;
                telephonyManager2 = yr.A00;
                return yr.A0F(telephonyManager2.isDataEnabled());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        YR yr2 = this.A00;
        String[] strArr = A01;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "x95Rh7kgyGSfBF3YHwpGzi";
        strArr2[3] = "73CHLU13D6YvD39ECjSAyL";
        return yr2.A07(AnonymousClass76.A05);
    }
}
