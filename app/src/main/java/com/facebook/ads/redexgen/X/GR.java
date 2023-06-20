package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class GR implements InterfaceC1233Rj {
    public final EnumC1225Rb A00;
    public final C4L A01;

    public GR(C4L c4l, EnumC1225Rb enumC1225Rb) {
        this.A01 = c4l;
        this.A00 = enumC1225Rb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1233Rj
    public void A3O(Map<RR, EnumC1238Ro> map, Map<GV, EnumC1225Rb> map2) {
        map2.put(this.A01, this.A00);
    }
}
