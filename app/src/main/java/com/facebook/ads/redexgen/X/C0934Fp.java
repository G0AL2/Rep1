package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Fp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0934Fp extends AbstractC1640d6 {
    public final /* synthetic */ C0927Fi A00;
    public final /* synthetic */ AbstractC1660dQ A01;
    public final /* synthetic */ C1649dF A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934Fp(C0927Fi c0927Fi, boolean z10, boolean z11, C1649dF c1649dF, AbstractC1660dQ abstractC1660dQ) {
        super(z10);
        this.A00 = c0927Fi;
        this.A03 = z11;
        this.A02 = c1649dF;
        this.A01 = abstractC1660dQ;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1640d6
    public final void A00() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACF(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1640d6
    public final void A01(boolean z10) {
        C1400Xy c1400Xy;
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        C1400Xy c1400Xy2;
        c1400Xy = this.A00.A04;
        if (!JR.A1D(c1400Xy) || !this.A03) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass14 = this.A00.A01;
            anonymousClass14.ACC(this.A01);
            return;
        }
        C0927Fi c0927Fi = this.A00;
        c1400Xy2 = c0927Fi.A04;
        c0927Fi.A07 = PB.A01(c1400Xy2, this.A02, 0, new C1667dX(this));
    }
}
