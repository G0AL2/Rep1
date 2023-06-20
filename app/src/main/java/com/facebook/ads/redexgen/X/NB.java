package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NB implements View.OnClickListener {
    public final /* synthetic */ TM A00;

    public NB(TM tm) {
        this.A00 = tm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ND nd2;
        if (L0.A02(this)) {
            return;
        }
        try {
            nd2 = this.A00.A06;
            nd2.AAo();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
