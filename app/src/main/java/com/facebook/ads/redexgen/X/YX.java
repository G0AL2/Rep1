package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.telephony.TelephonyManager;

/* loaded from: assets/audience_network.dex */
public class YX implements InterfaceC07386v {
    public final /* synthetic */ YR A00;

    public YX(YR yr) {
        this.A00 = yr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        TelephonyManager telephonyManager;
        TelephonyManager telephonyManager2;
        if (Build.VERSION.SDK_INT >= 23) {
            telephonyManager = this.A00.A00;
            if (telephonyManager != null) {
                YR yr = this.A00;
                telephonyManager2 = yr.A00;
                return yr.A04(telephonyManager2.getPhoneCount());
            }
            return this.A00.A07(AnonymousClass76.A07);
        }
        return this.A00.A07(AnonymousClass76.A05);
    }
}
