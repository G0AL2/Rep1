package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Mu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1114Mu implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public View$OnClickListenerC1114Mu(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1108Mo interfaceC1108Mo;
        NA na2;
        InterfaceC1108Mo interfaceC1108Mo2;
        if (L0.A02(this)) {
            return;
        }
        try {
            interfaceC1108Mo = this.A00.A00;
            if (interfaceC1108Mo != null) {
                na2 = this.A00.A05;
                if (na2.A03()) {
                    interfaceC1108Mo2 = this.A00.A00;
                    interfaceC1108Mo2.AAK();
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
