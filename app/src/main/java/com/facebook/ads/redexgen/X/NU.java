package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NU implements View.OnClickListener {
    public final /* synthetic */ TI A00;

    public NU(TI ti) {
        this.A00 = ti;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.ABW(C2F.A05);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
