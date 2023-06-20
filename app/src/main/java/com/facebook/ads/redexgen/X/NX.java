package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NX implements View.OnClickListener {
    public final /* synthetic */ NR A00;
    public final /* synthetic */ TH A01;

    public NX(TH th, NR nr) {
        this.A01 = th;
        this.A00 = nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ABW(C2F.A03);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
