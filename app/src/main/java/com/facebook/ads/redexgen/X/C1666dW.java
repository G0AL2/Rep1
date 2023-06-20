package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.dW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1666dW implements InterfaceC06975f {
    public final /* synthetic */ C0927Fi A00;

    public C1666dW(C0927Fi c0927Fi) {
        this.A00 = c0927Fi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA1() {
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACC(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06975f
    public final void AA2() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACF(this.A00, AdError.CACHE_ERROR);
    }
}
