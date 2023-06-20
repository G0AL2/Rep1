package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import com.google.ads.mediation.unity.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

@Keep
/* loaded from: classes2.dex */
public class UnityBannerAd extends UnityMediationAdapter implements MediationBannerAdapter {
    private String bannerPlacementId;
    private BannerView bannerView;
    private o7.a eventAdapter;
    private String gameId;
    private BannerView.IListener mUnityBannerListener = new a();
    private MediationBannerListener mediationBannerListener;

    /* loaded from: classes2.dex */
    class a extends BannerView.Listener {
        a() {
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad was clicked for placement ID: %s", UnityBannerAd.this.bannerView.getPlacementId()));
            UnityBannerAd.this.eventAdapter.a(a.b.CLICKED);
            UnityBannerAd.this.eventAdapter.a(a.b.OPENED);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            UnityBannerAd.this.sendBannerFailedToLoad(com.google.ads.mediation.unity.a.h(bannerErrorInfo), bannerErrorInfo.errorMessage);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerView) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads banner ad left application for placement ID: %s", UnityBannerAd.this.bannerView.getPlacementId()));
            UnityBannerAd.this.eventAdapter.a(a.b.LEFT_APPLICATION);
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads finished loading banner ad for placement ID: %s", UnityBannerAd.this.bannerView.getPlacementId()));
            UnityBannerAd.this.eventAdapter.a(a.b.LOADED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements IUnityAdsInitializationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f20711a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UnityBannerSize f20712b;

        b(Activity activity, UnityBannerSize unityBannerSize) {
            this.f20711a = activity;
            this.f20712b = unityBannerSize;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load banner ad with placement ID: %s", UnityBannerAd.this.gameId, UnityBannerAd.this.bannerPlacementId));
            if (UnityBannerAd.this.bannerView == null) {
                UnityBannerAd.this.bannerView = new BannerView(this.f20711a, UnityBannerAd.this.bannerPlacementId, this.f20712b);
            }
            UnityBannerAd.this.bannerView.setListener(UnityBannerAd.this.mUnityBannerListener);
            UnityBannerAd.this.bannerView.load();
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError b10 = com.google.ads.mediation.unity.a.b(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", UnityBannerAd.this.gameId, str));
            Log.w(UnityMediationAdapter.TAG, b10.toString());
            if (UnityBannerAd.this.mediationBannerListener != null) {
                UnityBannerAd.this.mediationBannerListener.onAdFailedToLoad(UnityBannerAd.this, b10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBannerFailedToLoad(int i10, String str) {
        AdError a10 = com.google.ads.mediation.unity.a.a(i10, str);
        Log.w(UnityMediationAdapter.TAG, a10.toString());
        MediationBannerListener mediationBannerListener = this.mediationBannerListener;
        if (mediationBannerListener != null) {
            mediationBannerListener.onAdFailedToLoad(this, a10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.bannerView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            bannerView.destroy();
        }
        this.bannerView = null;
        this.mediationBannerListener = null;
        this.mUnityBannerListener = null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        this.eventAdapter = new o7.a(mediationBannerListener, this);
        this.gameId = bundle.getString("gameId");
        String string = bundle.getString("zoneId");
        this.bannerPlacementId = string;
        if (!UnityAdapter.areValidIds(this.gameId, string)) {
            sendBannerFailedToLoad(101, "Missing or invalid server parameters.");
        } else if (!(context instanceof Activity)) {
            sendBannerFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
        } else {
            Activity activity = (Activity) context;
            UnityBannerSize i10 = com.google.ads.mediation.unity.a.i(context, adSize);
            if (i10 == null) {
                sendBannerFailedToLoad(110, String.format("There is no matching Unity Ads ad size for Google ad size: %s", adSize));
            } else {
                com.google.ads.mediation.unity.b.a().b(context, this.gameId, new b(activity, i10));
            }
        }
    }
}
