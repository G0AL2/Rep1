package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.d6  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1640d6 implements C7M {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z10);

    public AbstractC1640d6(boolean z10) {
        this.A00 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        A01(true);
    }
}
