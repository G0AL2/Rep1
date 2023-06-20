package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;

/* loaded from: assets/audience_network.dex */
public class YW implements InterfaceC07386v {
    public static String[] A01 = {"Vo88lINS9S2N5LbTaKf1W2kwN6BIQQdD", "UoAdPktVrqtin724LV50L5", "LFaB2DLRyLVTAupR8IDTAiu1ygiAQNei", "sJjAsr1DYzEdJFVxSj", "YixUmkecZHZtQTXRs3SEpcqVtXLRAsNc", "NCQvJXIWgGsA6V8X34C", "SF2vY0k52k3yZQV1rBM1cg", "e4uMFN1tyFqCHoW3Lf"};
    public final /* synthetic */ YR A00;

    public YW(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        telephonyManager = this.A00.A00;
        if (telephonyManager != null) {
            YR yr = this.A00;
            telephonyManager2 = yr.A00;
            return yr.A08(telephonyManager2.getNetworkOperator());
        }
        YR yr2 = this.A00;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[5] = "y3WpFIrw6SINDCFjG4EXd7NBg48ZDa";
        return yr2.A07(AnonymousClass76.A07);
    }
}
