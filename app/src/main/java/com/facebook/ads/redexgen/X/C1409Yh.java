package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1409Yh implements InterfaceC07386v {
    public final /* synthetic */ C1407Yf A00;
    public final /* synthetic */ List A01;

    public C1409Yh(C1407Yf c1407Yf, List list) {
        this.A00 = c1407Yf;
        this.A01 = list;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        C7A A02;
        HashMap hashMap = new HashMap();
        for (C07376u c07376u : this.A01) {
            if (c07376u.A02()) {
                String str = (String) c07376u.A01();
                C1408Yg systemProperty = new C1408Yg(str);
                hashMap.put(str, systemProperty);
            }
        }
        A02 = this.A00.A02(hashMap);
        return A02;
    }
}
