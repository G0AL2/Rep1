package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NK implements View.OnClickListener {
    public final /* synthetic */ NM A00;

    public NK(NM nm) {
        this.A00 = nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NP np;
        if (L0.A02(this)) {
            return;
        }
        try {
            np = this.A00.A04;
            np.A8k();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
