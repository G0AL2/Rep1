package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class GQ implements InterfaceC1233Rj {
    public final C0969Gy A00;
    public final EnumC1238Ro A01;

    public GQ(C0969Gy c0969Gy, EnumC1238Ro enumC1238Ro) {
        this.A00 = c0969Gy;
        this.A01 = enumC1238Ro;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1233Rj
    public void A3O(Map<RR, EnumC1238Ro> map, Map<GV, EnumC1225Rb> map2) {
        map.put(this.A00, this.A01);
    }
}
