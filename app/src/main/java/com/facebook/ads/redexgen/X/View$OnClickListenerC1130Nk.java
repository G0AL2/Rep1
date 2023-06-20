package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1130Nk implements View.OnClickListener {
    public final /* synthetic */ TG A00;

    public View$OnClickListenerC1130Nk(TG tg) {
        this.A00 = tg;
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
