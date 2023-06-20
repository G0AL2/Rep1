package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public class ZB implements InterfaceC07386v {
    public final /* synthetic */ C1423Yv A00;

    public ZB(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        String[] strArr;
        String[] strArr2;
        C6C c6c;
        String[] strArr3;
        strArr = this.A00.A06;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList();
            strArr2 = this.A00.A06;
            int length = strArr2.length;
            c6c = this.A00.A03;
            int min = Math.min(length, c6c.A0U());
            for (int i10 = 0; i10 < min; i10++) {
                strArr3 = this.A00.A06;
                arrayList.add(strArr3[i10]);
            }
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
