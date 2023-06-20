package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.unity.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* compiled from: UnityRewardedAd.java */
/* loaded from: classes2.dex */
public class d implements MediationRewardedAd {

    /* renamed from: a  reason: collision with root package name */
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f20730a;

    /* renamed from: b  reason: collision with root package name */
    private MediationRewardedAdCallback f20731b;

    /* renamed from: c  reason: collision with root package name */
    private String f20732c;

    /* renamed from: d  reason: collision with root package name */
    private o7.c f20733d;

    /* renamed from: e  reason: collision with root package name */
    private final IUnityAdsLoadListener f20734e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final IUnityAdsShowListener f20735f = new c();

    /* compiled from: UnityRewardedAd.java */
    /* loaded from: classes2.dex */
    class a implements IUnityAdsLoadListener {
        a() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", str));
            d.this.f20732c = str;
            d.this.h();
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            d.this.f20732c = str;
            d.this.g(com.google.ads.mediation.unity.a.c(unityAdsLoadError, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UnityRewardedAd.java */
    /* loaded from: classes2.dex */
    public class b implements IUnityAdsInitializationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f20737a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f20738b;

        b(String str, String str2) {
            this.f20737a = str;
            this.f20738b = str2;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", this.f20737a, this.f20738b));
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            d.this.g(com.google.ads.mediation.unity.a.b(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.f20737a, str)));
        }
    }

    /* compiled from: UnityRewardedAd.java */
    /* loaded from: classes2.dex */
    class c implements IUnityAdsShowListener {
        c() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            d.this.f20733d.a(a.b.CLICKED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                d.this.f20733d.a(a.b.VIDEO_COMPLETE);
                d.this.f20733d.a(a.b.REWARD);
            }
            d.this.f20733d.a(a.b.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            if (d.this.f20731b != null) {
                d.this.f20731b.onAdFailedToShow(com.google.ads.mediation.unity.a.d(unityAdsShowError, str2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            d.this.f20733d.a(a.b.IMPRESSION);
            d.this.f20733d.a(a.b.VIDEO_START);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(AdError adError) {
        Log.w(UnityMediationAdapter.TAG, adError.toString());
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f20730a;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f20730a;
        if (mediationAdLoadCallback != null) {
            MediationRewardedAdCallback onSuccess = mediationAdLoadCallback.onSuccess(this);
            this.f20731b = onSuccess;
            this.f20733d = new o7.c(onSuccess);
        }
    }

    public void f(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f20730a = mediationAdLoadCallback;
        Context context = mediationRewardedAdConfiguration.getContext();
        if (!(context instanceof Activity)) {
            g(com.google.ads.mediation.unity.a.a(105, "Unity Ads requires an Activity context to load ads."));
            return;
        }
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("gameId");
        String string2 = serverParameters.getString("zoneId");
        if (!UnityAdapter.areValidIds(string, string2)) {
            g(com.google.ads.mediation.unity.a.a(101, "Missing or invalid server parameters."));
            return;
        }
        com.google.ads.mediation.unity.b.a().b(context, string, new b(string, string2));
        UnityAds.load(string2, this.f20734e);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        if (!(context instanceof Activity)) {
            AdError a10 = com.google.ads.mediation.unity.a.a(105, "Unity Ads requires an Activity context to show ads.");
            Log.e(UnityMediationAdapter.TAG, a10.toString());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f20731b;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(a10);
                return;
            }
            return;
        }
        Activity activity = (Activity) context;
        if (this.f20732c == null) {
            Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
        }
        UnityAds.show(activity, this.f20732c, this.f20735f);
        this.f20733d.a(a.b.OPENED);
    }
}
