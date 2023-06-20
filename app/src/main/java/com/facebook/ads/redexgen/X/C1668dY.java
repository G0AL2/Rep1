package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.dY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1668dY implements InterfaceC06975f {
    public final /* synthetic */ C0927Fi A00;
    public final /* synthetic */ boolean A01;

    public C1668dY(C0927Fi c0927Fi, boolean z10) {
        this.A00 = c0927Fi;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA1() {
        C1400Xy c1400Xy;
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        C1400Xy c1400Xy2;
        AnonymousClass18 anonymousClass18;
        c1400Xy = this.A00.A04;
        if (!JR.A1D(c1400Xy) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass14 = this.A00.A01;
            anonymousClass14.ACC(this.A00);
            return;
        }
        C0927Fi c0927Fi = this.A00;
        c1400Xy2 = c0927Fi.A04;
        anonymousClass18 = this.A00.A03;
        c0927Fi.A07 = PB.A01(c1400Xy2, (C1649dF) anonymousClass18, 0, new C1669dZ(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA2() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACF(this.A00, AdError.CACHE_ERROR);
    }
}
