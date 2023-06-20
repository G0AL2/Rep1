package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class S5 extends AbstractC1219Qv {
    public static String[] A06 = {"9EcwbXL", "xSjvPMkgWWioBuUjephCpzaMcXmM2sD", "H", "Z0OwbQNEejaaYPjBGD9d9AX", "LifEXsQyKShCOMizwIOXiweZ0", "XJXBCYBKjtegaNwUZmi8zWUKmanAO", "UJgIUi3fLAa", "b39pUeydvHz6vxm1zIrt3qO8a47iYX"};
    public final /* synthetic */ InterfaceC1028Jh A00;
    public final /* synthetic */ MK A01;
    public final /* synthetic */ C1172Pa A02;
    public final /* synthetic */ S3 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public S5(S3 s32, String str, C1172Pa c1172Pa, InterfaceC1028Jh interfaceC1028Jh, Map map, MK mk) {
        this.A03 = s32;
        this.A04 = str;
        this.A02 = c1172Pa;
        this.A00 = interfaceC1028Jh;
        this.A05 = map;
        this.A01 = mk;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1219Qv
    public final void A02() {
        C1220Qw c1220Qw;
        SparseBooleanArray sparseBooleanArray;
        C1220Qw c1220Qw2;
        SparseBooleanArray sparseBooleanArray2;
        c1220Qw = this.A03.A01;
        if (c1220Qw.A0Z()) {
            return;
        }
        String str = this.A04;
        if (A06[0].length() != 7) {
            throw new RuntimeException();
        }
        A06[7] = "G0eOJNFPtps4qsYKpGpuAXPxSINW56";
        if (!TextUtils.isEmpty(str)) {
            sparseBooleanArray = this.A03.A04;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                InterfaceC1028Jh interfaceC1028Jh = this.A00;
                String str2 = this.A04;
                OG og = new OG(this.A05);
                c1220Qw2 = this.A03.A02;
                interfaceC1028Jh.A93(str2, og.A03(c1220Qw2).A02(this.A01).A05());
                sparseBooleanArray2 = this.A03.A04;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
