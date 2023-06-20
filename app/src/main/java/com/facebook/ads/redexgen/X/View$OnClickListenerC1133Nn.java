package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1133Nn implements View.OnClickListener {
    public final /* synthetic */ C1138Ns A00;

    public View$OnClickListenerC1133Nn(C1138Ns c1138Ns) {
        this.A00 = c1138Ns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1137Nr interfaceC1137Nr;
        InterfaceC1137Nr interfaceC1137Nr2;
        if (L0.A02(this)) {
            return;
        }
        try {
            interfaceC1137Nr = this.A00.A04;
            if (interfaceC1137Nr == null) {
                return;
            }
            interfaceC1137Nr2 = this.A00.A04;
            interfaceC1137Nr2.AAK();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
