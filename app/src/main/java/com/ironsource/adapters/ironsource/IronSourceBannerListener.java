package com.ironsource.adapters.ironsource;

import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.sdk.c.a;
import com.ironsource.sdk.c.c;
import com.ironsource.sdk.j.b;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
class IronSourceBannerListener implements b {
    private WeakReference<IronSourceAdapter> mAdapter;
    private final String mDemandSourceName;
    private final BannerSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceBannerListener(IronSourceAdapter ironSourceAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new WeakReference<>(ironSourceAdapter);
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerClick() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerAdClicked();
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerInitFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, str));
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerInitSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        this.mListener.onBannerInitSuccess();
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerLoadFail(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        BannerSmashListener bannerSmashListener = this.mListener;
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerLoadSuccess(a aVar) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " bannerListener");
        if (this.mAdapter.get() != null) {
            if (aVar == null) {
                this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
                return;
            }
            this.mAdapter.get().mBannerAdContainer = aVar;
            c cVar = aVar.f27635a;
            com.ironsource.sdk.a aVar2 = cVar != null ? cVar.f27646e : new com.ironsource.sdk.a();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar2.f27572a, aVar2.f27573b);
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(aVar, layoutParams);
        }
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerShowSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " onBannerShowSuccess");
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
