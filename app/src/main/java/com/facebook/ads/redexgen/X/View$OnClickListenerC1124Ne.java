package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ne  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1124Ne implements View.OnClickListener {
    public final /* synthetic */ C2H A00;
    public final /* synthetic */ NR A01;
    public final /* synthetic */ C1125Nf A02;

    public View$OnClickListenerC1124Ne(C1125Nf c1125Nf, NR nr, C2H c2h) {
        this.A02 = c1125Nf;
        this.A01 = nr;
        this.A00 = c2h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NP np;
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            np = this.A02.A02;
            np.ABf(this.A00);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
