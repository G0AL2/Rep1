package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1175Pd implements View.OnClickListener {
    public final /* synthetic */ C1178Pg A00;

    public View$OnClickListenerC1175Pd(C1178Pg c1178Pg) {
        this.A00 = c1178Pg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1177Pf interfaceC1177Pf;
        EnumC1176Pe enumC1176Pe;
        if (L0.A02(this)) {
            return;
        }
        try {
            interfaceC1177Pf = this.A00.A02;
            enumC1176Pe = this.A00.A01;
            interfaceC1177Pf.ACT(enumC1176Pe);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
