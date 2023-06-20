package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OS implements View.OnClickListener {
    public final /* synthetic */ OU A00;

    public OS(OU ou) {
        this.A00 = ou;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
