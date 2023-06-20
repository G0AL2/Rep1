package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* loaded from: assets/audience_network.dex */
public class US implements K0 {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ UN A01;

    public US(UN un, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = un;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.X.K0
    public final void AEa() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.X.K0
    public final void AEd(NativeAd nativeAd) {
        this.A01.A0I(UB.A0L(nativeAd.getInternalNativeAd()), new UO(UB.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.X.K0
    public final void AFI() {
        this.A01.A0D();
    }
}
