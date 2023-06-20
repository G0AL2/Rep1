package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.bp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1567bp extends AbstractRunnableC1065Kv {
    public final /* synthetic */ C1564bm A00;

    public C1567bp(C1564bm c1564bm) {
        this.A00 = c1564bm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1065Kv
    public final void A01() {
        AnonymousClass54 anonymousClass54;
        AnonymousClass54 anonymousClass542;
        AnonymousClass54 anonymousClass543;
        anonymousClass54 = this.A00.A01;
        if (anonymousClass54.A06() != null) {
            anonymousClass542 = this.A00.A01;
            AdListener A06 = anonymousClass542.A06();
            anonymousClass543 = this.A00.A01;
            A06.onAdLoaded(anonymousClass543.A07());
        }
    }
}
