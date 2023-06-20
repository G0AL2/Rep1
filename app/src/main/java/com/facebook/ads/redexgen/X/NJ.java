package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NJ implements View.OnClickListener {
    public final /* synthetic */ NM A00;

    public NJ(NM nm) {
        this.A00 = nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        NP np;
        NP np2;
        if (L0.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A05;
            if (z10) {
                np2 = this.A00.A04;
                np2.A42();
                return;
            }
            np = this.A00.A04;
            np.A43();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
