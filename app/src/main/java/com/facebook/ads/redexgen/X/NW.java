package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NW implements View.OnClickListener {
    public final /* synthetic */ TH A00;

    public NW(TH th) {
        this.A00 = th;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A7t();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
