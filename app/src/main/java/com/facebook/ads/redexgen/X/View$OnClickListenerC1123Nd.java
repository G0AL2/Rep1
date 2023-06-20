package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1123Nd implements View.OnClickListener {
    public final /* synthetic */ C1125Nf A00;

    public View$OnClickListenerC1123Nd(C1125Nf c1125Nf) {
        this.A00 = c1125Nf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NP np;
        if (L0.A02(this)) {
            return;
        }
        try {
            np = this.A00.A02;
            np.A7t();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
