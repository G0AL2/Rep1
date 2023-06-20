package com.facebook.ads.redexgen.X;

import android.content.pm.ServiceInfo;

/* loaded from: assets/audience_network.dex */
public class ZD implements InterfaceC07386v {
    public static String[] A01 = {"Kjl9x1nXLMp", "FYT6FJfE388FncoeBbUW5LDH7Ti6Kpnc", "Yxd2XW5tX0tpbE5v80iFGWNMQ7F", "Eun4caaboMQouomEKTkKbMJy1uWMR8C3", "2B", "gVUv49X3C1I0CRHiCQrxfKc2j3pZm33W", "VtV7HGxoJcmYVE0XtMWfAnTQdxbbthfO", "Muv0aFmfDz7QlEQw1d"};
    public final /* synthetic */ C1423Yv A00;

    public ZD(C1423Yv c1423Yv) {
        this.A00 = c1423Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        ServiceInfo[] serviceInfoArr;
        ServiceInfo[] serviceInfoArr2;
        serviceInfoArr = this.A00.A05;
        if (serviceInfoArr != null) {
            C1423Yv c1423Yv = this.A00;
            serviceInfoArr2 = c1423Yv.A05;
            return c1423Yv.A04(serviceInfoArr2.length);
        }
        C1423Yv c1423Yv2 = this.A00;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            String[] strArr2 = A01;
            strArr2[0] = "czOc910r7ol";
            strArr2[2] = "WgsI1fVM7Yu7d9q7aeaJmksjNii";
            return c1423Yv2.A07(AnonymousClass76.A07);
        }
        throw new RuntimeException();
    }
}
