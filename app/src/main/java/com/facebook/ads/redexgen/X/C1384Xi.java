package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1384Xi implements InterfaceC1068Ky {
    @Override // com.facebook.ads.redexgen.X.InterfaceC1068Ky
    public final void AE0(Throwable th, Object obj) {
        if (obj instanceof C8S) {
            C1400Xy A5b = ((C8S) obj).A5b();
            if (A5b != null) {
                A5b.A0H(th);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C1400Xy)) {
                return;
            }
            ((C1400Xy) context).A0H(th);
        }
    }
}
