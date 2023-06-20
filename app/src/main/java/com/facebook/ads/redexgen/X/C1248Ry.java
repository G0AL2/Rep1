package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ry  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1248Ry extends AbstractC1219Qv {
    public final /* synthetic */ InterfaceC1028Jh A00;
    public final /* synthetic */ MK A01;
    public final /* synthetic */ C1172Pa A02;
    public final /* synthetic */ C1246Rw A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C1248Ry(C1246Rw c1246Rw, String str, C1172Pa c1172Pa, InterfaceC1028Jh interfaceC1028Jh, Map map, MK mk) {
        this.A03 = c1246Rw;
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
        if (!c1220Qw.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A07;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                InterfaceC1028Jh interfaceC1028Jh = this.A00;
                String str = this.A04;
                OG og = new OG(this.A05);
                c1220Qw2 = this.A03.A02;
                interfaceC1028Jh.A93(str, og.A03(c1220Qw2).A02(this.A01).A05());
                sparseBooleanArray2 = this.A03.A07;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
