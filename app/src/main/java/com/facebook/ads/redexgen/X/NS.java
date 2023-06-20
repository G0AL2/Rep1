package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NS implements View.OnClickListener {
    public final /* synthetic */ TI A00;

    public NS(TI ti) {
        this.A00 = ti;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A43();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
