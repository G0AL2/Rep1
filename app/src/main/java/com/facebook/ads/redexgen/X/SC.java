package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class SC implements InterfaceC1166Ou {
    public final /* synthetic */ SB A00;

    public SC(SB sb2) {
        this.A00 = sb2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1166Ou
    public final void ACm(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1166Ou
    public final void ACo(View view) {
        AbstractC1261Sl abstractC1261Sl = (AbstractC1261Sl) view;
        abstractC1261Sl.A0g();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1261Sl.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
