package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.chartboost.sdk.Banner.BannerSize;
import com.chartboost.sdk.ChartboostBanner;
import com.chartboost.sdk.ChartboostBannerListener;
import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostCacheEvent;
import com.chartboost.sdk.Events.ChartboostClickError;
import com.chartboost.sdk.Events.ChartboostClickEvent;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Events.ChartboostShowEvent;
import com.chartboost.sdk.Model.CBError;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
/* loaded from: classes2.dex */
public class ChartboostAdapter extends ChartboostMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    static final String TAG = "ChartboostAdapter";
    private FrameLayout mBannerContainer;
    private ChartboostBanner mChartboostBanner;
    private Context mContext;
    private boolean mIsLoading;
    private MediationBannerListener mMediationBannerListener;
    private MediationInterstitialListener mMediationInterstitialListener;
    private com.google.ads.mediation.chartboost.c mChartboostParams = new com.google.ads.mediation.chartboost.c();
    private final AtomicBoolean onAdCachedCalled = new AtomicBoolean(false);
    private final com.google.ads.mediation.chartboost.a mChartboostInterstitialDelegate = new a();
    private final com.google.ads.mediation.chartboost.a mChartboostBannerDelegate = new b();
    private final ChartboostBannerListener mChartboostBannerListener = new c();

    /* loaded from: classes2.dex */
    class a extends com.google.ads.mediation.chartboost.a {
        a() {
        }

        @Override // com.google.ads.mediation.chartboost.a
        public com.google.ads.mediation.chartboost.c a() {
            return ChartboostAdapter.this.mChartboostParams;
        }

        @Override // com.google.ads.mediation.chartboost.a
        public void b(AdError adError) {
            Log.e(ChartboostAdapter.TAG, adError.toString());
            if (ChartboostAdapter.this.mMediationInterstitialListener != null) {
                ChartboostAdapter.this.mMediationInterstitialListener.onAdFailedToLoad(ChartboostAdapter.this, adError);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didCacheInterstitial(String str) {
            super.didCacheInterstitial(str);
            if (ChartboostAdapter.this.mMediationInterstitialListener != null && ChartboostAdapter.this.mIsLoading && str.equals(ChartboostAdapter.this.mChartboostParams.f())) {
                ChartboostAdapter.this.mIsLoading = false;
                ChartboostAdapter.this.mMediationInterstitialListener.onAdLoaded(ChartboostAdapter.this);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didClickInterstitial(String str) {
            super.didClickInterstitial(str);
            if (ChartboostAdapter.this.mMediationInterstitialListener != null) {
                ChartboostAdapter.this.mMediationInterstitialListener.onAdClicked(ChartboostAdapter.this);
                ChartboostAdapter.this.mMediationInterstitialListener.onAdLeftApplication(ChartboostAdapter.this);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didDismissInterstitial(String str) {
            super.didDismissInterstitial(str);
            if (ChartboostAdapter.this.mMediationInterstitialListener != null) {
                ChartboostAdapter.this.mMediationInterstitialListener.onAdClosed(ChartboostAdapter.this);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didDisplayInterstitial(String str) {
            super.didDisplayInterstitial(str);
            if (ChartboostAdapter.this.mMediationInterstitialListener != null) {
                ChartboostAdapter.this.mMediationInterstitialListener.onAdOpened(ChartboostAdapter.this);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            super.didFailToLoadInterstitial(str, cBImpressionError);
            AdError e10 = com.google.ads.mediation.chartboost.b.e(cBImpressionError);
            Log.i(ChartboostAdapter.TAG, e10.toString());
            if (ChartboostAdapter.this.mMediationInterstitialListener == null || !str.equals(ChartboostAdapter.this.mChartboostParams.f())) {
                return;
            }
            if (ChartboostAdapter.this.mIsLoading) {
                ChartboostAdapter.this.mIsLoading = false;
                ChartboostAdapter.this.mMediationInterstitialListener.onAdFailedToLoad(ChartboostAdapter.this, e10);
            } else if (cBImpressionError == CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW) {
                ChartboostAdapter.this.mMediationInterstitialListener.onAdOpened(ChartboostAdapter.this);
                ChartboostAdapter.this.mMediationInterstitialListener.onAdClosed(ChartboostAdapter.this);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didInitialize() {
            super.didInitialize();
            ChartboostAdapter.this.mIsLoading = true;
            e.o(ChartboostAdapter.this.mChartboostInterstitialDelegate);
        }
    }

    /* loaded from: classes2.dex */
    class b extends com.google.ads.mediation.chartboost.a {
        b() {
        }

        @Override // com.google.ads.mediation.chartboost.a
        public com.google.ads.mediation.chartboost.c a() {
            return ChartboostAdapter.this.mChartboostParams;
        }

        @Override // com.google.ads.mediation.chartboost.a
        public void b(AdError adError) {
            Log.e(ChartboostAdapter.TAG, adError.toString());
            if (ChartboostAdapter.this.mMediationBannerListener != null) {
                ChartboostAdapter.this.mMediationBannerListener.onAdFailedToLoad(ChartboostAdapter.this, adError);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didInitialize() {
            super.didInitialize();
            String f10 = ChartboostAdapter.this.mChartboostParams.f();
            ChartboostAdapter.this.mBannerContainer = new FrameLayout(ChartboostAdapter.this.mContext);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            ChartboostAdapter.this.mChartboostBanner = new ChartboostBanner(ChartboostAdapter.this.mContext, f10, ChartboostAdapter.this.mChartboostParams.c(), ChartboostAdapter.this.mChartboostBannerListener);
            ChartboostAdapter.this.mChartboostBanner.setAutomaticallyRefreshesContent(false);
            ChartboostAdapter.this.mBannerContainer.addView(ChartboostAdapter.this.mChartboostBanner, layoutParams);
            ChartboostAdapter.this.mChartboostBanner.cache();
        }
    }

    /* loaded from: classes2.dex */
    class c implements ChartboostBannerListener {
        c() {
        }

        @Override // com.chartboost.sdk.ChartboostAdListener
        public void onAdCached(ChartboostCacheEvent chartboostCacheEvent, ChartboostCacheError chartboostCacheError) {
            if (ChartboostAdapter.this.onAdCachedCalled.getAndSet(true) || ChartboostAdapter.this.mMediationBannerListener == null) {
                return;
            }
            if (chartboostCacheError == null) {
                ChartboostAdapter.this.mMediationBannerListener.onAdLoaded(ChartboostAdapter.this);
                ChartboostAdapter.this.mChartboostBanner.show();
                return;
            }
            AdError b10 = com.google.ads.mediation.chartboost.b.b(chartboostCacheError);
            String str = ChartboostAdapter.TAG;
            Log.i(str, "Failed to load banner ad: " + b10);
            ChartboostAdapter.this.mMediationBannerListener.onAdFailedToLoad(ChartboostAdapter.this, b10);
            e.q(ChartboostAdapter.this.mChartboostBannerDelegate);
        }

        @Override // com.chartboost.sdk.ChartboostAdListener
        public void onAdClicked(ChartboostClickEvent chartboostClickEvent, ChartboostClickError chartboostClickError) {
            if (ChartboostAdapter.this.mMediationBannerListener == null) {
                return;
            }
            if (chartboostClickError == null) {
                ChartboostAdapter.this.mMediationBannerListener.onAdClicked(ChartboostAdapter.this);
                ChartboostAdapter.this.mMediationBannerListener.onAdOpened(ChartboostAdapter.this);
                ChartboostAdapter.this.mMediationBannerListener.onAdLeftApplication(ChartboostAdapter.this);
                return;
            }
            AdError c10 = com.google.ads.mediation.chartboost.b.c(chartboostClickError);
            String str = ChartboostAdapter.TAG;
            Log.i(str, "Chartboost click event had an error: " + c10);
        }

        @Override // com.chartboost.sdk.ChartboostAdListener
        public void onAdShown(ChartboostShowEvent chartboostShowEvent, ChartboostShowError chartboostShowError) {
            if (chartboostShowError != null) {
                AdError d10 = com.google.ads.mediation.chartboost.b.d(chartboostShowError);
                String str = ChartboostAdapter.TAG;
                Log.i(str, "Failed to show banner ad: " + d10);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mBannerContainer;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        if (this.mChartboostBanner != null) {
            e.q(this.mChartboostBannerDelegate);
            this.mChartboostBanner.detachBanner();
            this.mChartboostBanner = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mMediationBannerListener = mediationBannerListener;
        this.mContext = context;
        com.google.ads.mediation.chartboost.c a10 = com.google.ads.mediation.chartboost.b.a(bundle, bundle2);
        this.mChartboostParams = a10;
        if (!com.google.ads.mediation.chartboost.b.h(a10)) {
            AdError adError = new AdError(102, "Invalid server parameters.", "com.google.ads.mediation.chartboost");
            Log.e(TAG, adError.toString());
            MediationBannerListener mediationBannerListener2 = this.mMediationBannerListener;
            if (mediationBannerListener2 != null) {
                mediationBannerListener2.onAdFailedToLoad(this, adError);
                return;
            }
            return;
        }
        BannerSize f10 = com.google.ads.mediation.chartboost.b.f(context, adSize);
        if (f10 == null) {
            AdError adError2 = new AdError(100, String.format("Unsupported size: %s", adSize), "com.google.ads.mediation.chartboost");
            Log.e(TAG, adError2.toString());
            this.mMediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        this.mChartboostParams.i(f10);
        e.u(context, this.mChartboostBannerDelegate);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mMediationInterstitialListener = mediationInterstitialListener;
        com.google.ads.mediation.chartboost.c a10 = com.google.ads.mediation.chartboost.b.a(bundle, bundle2);
        this.mChartboostParams = a10;
        if (!com.google.ads.mediation.chartboost.b.h(a10)) {
            AdError adError = new AdError(102, "Invalid server parameters.", "com.google.ads.mediation.chartboost");
            Log.e(TAG, adError.toString());
            MediationInterstitialListener mediationInterstitialListener2 = this.mMediationInterstitialListener;
            if (mediationInterstitialListener2 != null) {
                mediationInterstitialListener2.onAdFailedToLoad(this, adError);
                return;
            }
            return;
        }
        e.v(context, this.mChartboostInterstitialDelegate);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        e.r(this.mChartboostInterstitialDelegate);
    }
}
