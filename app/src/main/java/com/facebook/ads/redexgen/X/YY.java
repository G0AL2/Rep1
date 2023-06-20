package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;

/* loaded from: assets/audience_network.dex */
public class YY implements InterfaceC07386v {
    public final /* synthetic */ YR A00;

    public YY(YR yr) {
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
            return yr.A04(telephonyManager2.getPhoneType());
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
