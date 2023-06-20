package com.facebook.ads.redexgen.X;

import android.telephony.TelephonyManager;

/* renamed from: com.facebook.ads.redexgen.X.Ye  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1406Ye implements InterfaceC07386v {
    public static String[] A01 = {"1jYE18OinQfv5WLTq2cVBe585KmN", "X325BmovX2W2cAXv5JjOdne9uqamI6Ku", "itArcmOQ038W2qOxTmWDysJ", "YLO301mgb0CV", "8Iuh4U1kakUbsQ2Nn", "O3ZH7jI89PddtJoXg7iV4O6wtsqjtnrU", "1x9H6MAyleaM4oP8QSazbLvKby53Pv0n", "YmZygv2VfDGVkOFuuIE9CAITaRVNY9b1"};
    public final /* synthetic */ YR A00;

    public C1406Ye(YR yr) {
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
            String simCountryIso = telephonyManager2.getSimCountryIso();
            String[] strArr = A01;
            if (strArr[6].charAt(3) != strArr[5].charAt(3)) {
                throw new RuntimeException();
            }
            A01[2] = "tduom2IhCerqtA7iCB";
            return yr.A08(simCountryIso);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
