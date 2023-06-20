package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class SN extends L8 {
    public final /* synthetic */ C9D A00;

    public SN(C9D c9d) {
        this.A00 = c9d;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        AbstractC1151Of abstractC1151Of;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC1151Of abstractC1151Of2;
        abstractC1151Of = this.A00.A00;
        if (abstractC1151Of != null) {
            abstractC1151Of2 = this.A00.A00;
            abstractC1151Of2.A0Z();
        }
        AbstractC1109Mp abstractC1109Mp = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC1109Mp.setToolbarActionMode(closeButtonStyle);
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
