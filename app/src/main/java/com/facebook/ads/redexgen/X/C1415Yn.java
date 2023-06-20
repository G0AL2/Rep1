package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1415Yn implements InterfaceC07386v {
    public final /* synthetic */ EnumC07346r A00;
    public final /* synthetic */ C1413Yl A01;
    public final /* synthetic */ List A02;

    public C1415Yn(C1413Yl c1413Yl, List list, EnumC07346r enumC07346r) {
        this.A01 = c1413Yl;
        this.A02 = list;
        this.A00 = enumC07346r;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        C7A A03;
        Context context;
        HashMap hashMap = new HashMap();
        for (C07376u c07376u : this.A02) {
            if (c07376u.A02()) {
                String str = (String) c07376u.A01();
                context = this.A01.A00;
                C1414Ym systemSettings = new C1414Ym(context, str, this.A00);
                hashMap.put(str, systemSettings);
            }
        }
        A03 = this.A01.A03(hashMap);
        return A03;
    }
}
