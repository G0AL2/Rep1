package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ug  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1307Ug implements InterfaceC1723eX<JX, C1023Jc> {
    public C1304Ud A00;

    public C1307Ug(C1304Ud c1304Ud) {
        this.A00 = c1304Ud;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eU != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1723eX
    public final void A5I(C1720eU<JX, C1023Jc> c1720eU, InterfaceC1709eJ interfaceC1709eJ) {
        int i10 = JV.A00[interfaceC1709eJ.A7o(c1720eU).ordinal()];
        if (i10 != 1 && i10 != 2) {
            return;
        }
        this.A00.A02(c1720eU, interfaceC1709eJ);
    }
}
