package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OR implements View.OnClickListener {
    public final /* synthetic */ OU A00;

    public OR(OU ou) {
        this.A00 = ou;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OT ot;
        View v10;
        View[] viewArr;
        QK qk;
        QK qk2;
        QK qk3;
        View v11;
        if (L0.A02(this)) {
            return;
        }
        try {
            ot = this.A00.A04;
            ot.ABP();
            v10 = this.A00.A00;
            if (v10 != null) {
                v11 = this.A00.A00;
                MS.A0L(v11);
            }
            viewArr = this.A00.A06;
            for (View v12 : viewArr) {
                MS.A0N(v12, 0);
            }
            MS.A0J(this.A00);
            qk = this.A00.A05;
            if (qk == null) {
                return;
            }
            qk2 = this.A00.A05;
            MS.A0N(qk2, 0);
            qk3 = this.A00.A05;
            qk3.A0b(Q6.A02, 14);
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
