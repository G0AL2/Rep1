package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N1 implements View.OnClickListener {
    public final /* synthetic */ TO A00;

    public N1(TO to) {
        this.A00 = to;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0X(false);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
