package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.v;

/* loaded from: classes.dex */
public class BannerExpressVideoView extends BannerExpressView {
    public BannerExpressVideoView(Context context, n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView
    protected void a() {
        NativeExpressVideoView nativeExpressVideoView = new NativeExpressVideoView(this.f11939a, this.f11942d, this.f11943e, this.f11948j);
        this.f11940b = nativeExpressVideoView;
        addView(nativeExpressVideoView, new ViewGroup.LayoutParams(-1, -1));
    }

    public com.bytedance.sdk.openadsdk.multipro.b.a getVideoModel() {
        NativeExpressView nativeExpressView = this.f11940b;
        if (nativeExpressView != null) {
            return ((NativeExpressVideoView) nativeExpressView).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView
    public void a(n nVar, AdSlot adSlot) {
        NativeExpressVideoView nativeExpressVideoView = new NativeExpressVideoView(this.f11939a, nVar, adSlot, this.f11948j);
        this.f11941c = nativeExpressVideoView;
        nativeExpressVideoView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressVideoView.1
            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdClicked(View view, int i10) {
                BannerExpressVideoView bannerExpressVideoView = BannerExpressVideoView.this;
                TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener = bannerExpressVideoView.f11944f;
                if (expressAdInteractionListener != null) {
                    expressAdInteractionListener.onAdClicked(bannerExpressVideoView, i10);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onAdShow(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderFail(View view, String str, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd.ExpressAdInteractionListener
            public void onRenderSuccess(View view, float f10, float f11) {
                BannerExpressVideoView.this.a(f10, f11);
                BannerExpressVideoView.this.e();
            }
        });
        v.a((View) this.f11941c, 8);
        addView(this.f11941c, new ViewGroup.LayoutParams(-1, -1));
    }
}
