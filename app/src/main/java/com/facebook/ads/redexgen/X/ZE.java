package com.facebook.ads.redexgen.X;

import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public class ZE implements InterfaceC07386v {
    public final /* synthetic */ C1423Yv A00;

    public ZE(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        C6C c6c;
        ServiceInfo[] serviceInfoArr3;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            serviceInfoArr2 = this.A00.A05;
            int length = serviceInfoArr2.length;
            c6c = this.A00.A03;
            int min = Math.min(length, c6c.A0U());
            for (int i10 = 0; i10 < min; i10++) {
                serviceInfoArr3 = this.A00.A05;
                arrayList.add(serviceInfoArr3[i10].name);
            }
            Collections.sort(arrayList);
            return this.A00.A0E(arrayList);
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
