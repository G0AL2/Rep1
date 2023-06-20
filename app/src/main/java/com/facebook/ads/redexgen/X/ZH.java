package com.facebook.ads.redexgen.X;

import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public class ZH implements InterfaceC07386v {
    public final /* synthetic */ ZF A00;

    public ZH(ZF zf) {
        this.A00 = zf;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() throws Exception {
        C7A A02;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        HashMap hashMap = new HashMap();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            hashMap.put(nextElement.getDisplayName(), new ZG(nextElement.getInetAddresses(), null));
        }
        A02 = this.A00.A02(hashMap);
        return A02;
    }
}
