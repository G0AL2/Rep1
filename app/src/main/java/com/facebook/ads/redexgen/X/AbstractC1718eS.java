package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.eS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1718eS {
    @Nullable
    public InterfaceC1719eT A00;

    public final void A00() {
        InterfaceC1719eT interfaceC1719eT = this.A00;
        if (interfaceC1719eT != null) {
            interfaceC1719eT.onStart();
        }
    }

    public final void A01() {
        InterfaceC1719eT interfaceC1719eT = this.A00;
        if (interfaceC1719eT != null) {
            interfaceC1719eT.onStop();
        }
    }

    public final void A02(InterfaceC1719eT interfaceC1719eT) {
        this.A00 = interfaceC1719eT;
    }
}
