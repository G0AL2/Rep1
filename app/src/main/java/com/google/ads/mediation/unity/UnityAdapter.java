package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import com.google.ads.mediation.unity.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import java.lang.ref.WeakReference;

@Keep
/* loaded from: classes2.dex */
public class UnityAdapter extends UnityMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private WeakReference<Activity> activityWeakReference;
    private UnityBannerAd bannerAd;
    private o7.b eventAdapter;
    private final IUnityAdsLoadListener mUnityLoadListener = new a();
    private final IUnityAdsShowListener mUnityShowListener = new c();
    private MediationInterstitialListener mediationInterstitialListener;
    private String placementId;

    /* loaded from: classes2.dex */
    class a implements IUnityAdsLoadListener {
        a() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", str));
            UnityAdapter.this.placementId = str;
            UnityAdapter.this.eventAdapter.a(a.b.LOADED);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            UnityAdapter.this.placementId = str;
            AdError c10 = com.google.ads.mediation.unity.a.c(unityAdsLoadError, str2);
            Log.w(UnityMediationAdapter.TAG, c10.toString());
            if (UnityAdapter.this.mediationInterstitialListener != null) {
                UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad(UnityAdapter.this, c10);
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements IUnityAdsInitializationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20707a;

        b(String str) {
            this.f20707a = str;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", this.f20707a, UnityAdapter.this.placementId));
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError b10 = com.google.ads.mediation.unity.a.b(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.f20707a, str));
            Log.w(UnityMediationAdapter.TAG, b10.toString());
            if (UnityAdapter.this.mediationInterstitialListener != null) {
                UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad(UnityAdapter.this, b10);
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements IUnityAdsShowListener {
        c() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad was clicked for placement ID: %s", UnityAdapter.this.placementId));
            UnityAdapter.this.eventAdapter.a(a.b.CLICKED);
            UnityAdapter.this.eventAdapter.a(a.b.LEFT_APPLICATION);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad finished playing for placement ID: %s", UnityAdapter.this.placementId));
            UnityAdapter.this.eventAdapter.a(a.b.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            Log.w(UnityMediationAdapter.TAG, com.google.ads.mediation.unity.a.d(unityAdsShowError, str2).toString());
            UnityAdapter.this.eventAdapter.a(a.b.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad started for placement ID: %s", UnityAdapter.this.placementId));
        }
    }

    public static boolean areValidIds(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    private void sendAdFailedToLoad(int i10, String str) {
        AdError a10 = com.google.ads.mediation.unity.a.a(i10, str);
        Log.w(UnityMediationAdapter.TAG, a10.toString());
        MediationInterstitialListener mediationInterstitialListener = this.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdFailedToLoad(this, a10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.bannerAd.getBannerView();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        this.mediationInterstitialListener = null;
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        UnityBannerAd unityBannerAd = new UnityBannerAd();
        this.bannerAd = unityBannerAd;
        unityBannerAd.requestBannerAd(context, mediationBannerListener, bundle, adSize, mediationAdRequest, bundle2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        this.eventAdapter = new o7.b(mediationInterstitialListener, this);
        String string = bundle.getString("gameId");
        String string2 = bundle.getString("zoneId");
        this.placementId = string2;
        if (!areValidIds(string, string2)) {
            sendAdFailedToLoad(101, "Missing or invalid server parameters.");
        } else if (!(context instanceof Activity)) {
            sendAdFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
        } else {
            this.activityWeakReference = new WeakReference<>((Activity) context);
            com.google.ads.mediation.unity.b.a().b(context, string, new b(string));
            UnityAds.load(this.placementId, this.mUnityLoadListener);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.eventAdapter.a(a.b.OPENED);
        WeakReference<Activity> weakReference = this.activityWeakReference;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            String str = UnityMediationAdapter.TAG;
            Log.w(str, "Failed to show interstitial ad for placement ID '" + this.placementId + "' from Unity Ads: Activity context is null.");
            this.eventAdapter.a(a.b.CLOSED);
            return;
        }
        if (this.placementId == null) {
            Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
        }
        UnityAds.show(activity, this.placementId, this.mUnityShowListener);
    }
}
