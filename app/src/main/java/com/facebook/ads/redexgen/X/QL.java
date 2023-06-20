package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class QL implements View.OnClickListener {
    public final /* synthetic */ KS A00;

    public QL(KS ks) {
        this.A00 = ks;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1036Jp c1036Jp;
        C1400Xy c1400Xy;
        QK qk;
        boolean A07;
        QK qk2;
        QK qk3;
        if (L0.A02(this)) {
            return;
        }
        try {
            c1036Jp = this.A00.A03;
            c1036Jp.A02(EnumC1035Jo.A0d, null);
            c1400Xy = this.A00.A02;
            c1400Xy.A0D().A2z();
            qk = this.A00.A00;
            if (qk != null) {
                A07 = this.A00.A07();
                if (A07) {
                    qk3 = this.A00.A00;
                    qk3.setVolume(1.0f);
                } else {
                    qk2 = this.A00.A00;
                    qk2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
