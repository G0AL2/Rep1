package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Em  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0905Em extends C1554bc {
    public InterfaceC1193Pv A00;

    public final void A04(NativeAdLayout nativeAdLayout, C1400Xy c1400Xy, NativeAd nativeAd, K7 k72) {
        OW ow = new OW(c1400Xy);
        MediaView mediaView = new MediaView(c1400Xy);
        AdOptionsView adOptionsView = new AdOptionsView(c1400Xy, nativeAd, nativeAdLayout);
        k72.A09(adOptionsView, 28);
        this.A00 = new C1240Rq(c1400Xy, nativeAd, k72, UB.A0L(nativeAd.getInternalNativeAd()).A17(), ow, mediaView, adOptionsView);
        MS.A0M(nativeAdLayout, k72.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, ow, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
