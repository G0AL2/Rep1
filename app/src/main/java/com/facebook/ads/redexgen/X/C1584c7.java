package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.c7  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1584c7 implements InterfaceC06844s {
    public final /* synthetic */ F9 A00;

    public C1584c7(F9 f92) {
        this.A00 = f92;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06844s
    public final void ADL(AbstractC06774l abstractC06774l, C4O c4o, C4O c4o2) {
        this.A00.A1n(abstractC06774l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06844s
    public final void ADN(AbstractC06774l abstractC06774l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        this.A00.A0r.A0c(abstractC06774l);
        this.A00.A1o(abstractC06774l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06844s
    public final void ADP(AbstractC06774l abstractC06774l, @NonNull C4O c4o, @NonNull C4O c4o2) {
        abstractC06774l.A0Z(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC06774l, abstractC06774l, c4o, c4o2)) {
                this.A00.A1N();
            }
        } else if (!this.A00.A05.A0G(abstractC06774l, c4o, c4o2)) {
        } else {
            this.A00.A1N();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06844s
    public final void AFJ(AbstractC06774l abstractC06774l) {
        this.A00.A06.A1D(abstractC06774l.A0H, this.A00.A0r);
    }
}
