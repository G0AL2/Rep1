package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: TTBannerExpressVideoAdImpl.java */
/* loaded from: classes.dex */
public class b extends a {
    public b(Context context, n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.a
    public void a(Context context, n nVar, AdSlot adSlot) {
        BannerExpressVideoView bannerExpressVideoView = new BannerExpressVideoView(context, nVar, adSlot);
        this.f11952a = bannerExpressVideoView;
        a(bannerExpressVideoView.getCurView(), this.f11954c);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public com.bytedance.sdk.openadsdk.multipro.b.a getVideoModel() {
        BannerExpressView bannerExpressView = this.f11952a;
        if (bannerExpressView != null) {
            return ((BannerExpressVideoView) bannerExpressView).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.m, com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        BannerExpressView bannerExpressView = this.f11952a;
        if (bannerExpressView != null) {
            bannerExpressView.setVideoAdListener(expressVideoAdListener);
        }
    }
}
