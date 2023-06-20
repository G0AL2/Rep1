package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;

/* loaded from: assets/audience_network.dex */
public class YJ implements InterfaceC07386v {
    public final /* synthetic */ YI A00;

    public YJ(YI yi) {
        this.A00 = yi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07386v
    public final C7A A5J() {
        return this.A00.A06(C7J.A02(TrafficStats.getTotalTxBytes()));
    }
}
