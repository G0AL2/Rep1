package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1173Pb implements View.OnClickListener {
    public final /* synthetic */ C1174Pc A00;

    public View$OnClickListenerC1173Pb(C1174Pc c1174Pc) {
        this.A00 = c1174Pc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C07326p c07326p;
        if (L0.A02(this)) {
            return;
        }
        try {
            c07326p = this.A00.A05;
            c07326p.performClick();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
