package com.google.ads.mediation.pangle;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.util.HashSet;
import java.util.List;
import n7.b;
import n7.c;
import n7.d;

/* loaded from: classes2.dex */
public class PangleMediationAdapter extends RtbAdapter {
    public static final String TAG = "PangleMediationAdapter";

    /* renamed from: e  reason: collision with root package name */
    private static int f20698e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static int f20699f = -1;

    /* renamed from: g  reason: collision with root package name */
    private static int f20700g = -1;

    /* renamed from: a  reason: collision with root package name */
    private n7.a f20701a;

    /* renamed from: b  reason: collision with root package name */
    private b f20702b;

    /* renamed from: c  reason: collision with root package name */
    private d f20703c;

    /* renamed from: d  reason: collision with root package name */
    private c f20704d;

    /* loaded from: classes2.dex */
    class a implements TTAdSdk.InitCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f20705a;

        a(PangleMediationAdapter pangleMediationAdapter, InitializationCompleteCallback initializationCompleteCallback) {
            this.f20705a = initializationCompleteCallback;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void fail(int i10, String str) {
            Log.w(PangleMediationAdapter.TAG, str);
            this.f20705a.onInitializationFailed(str);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdSdk.InitCallback
        public void success() {
            this.f20705a.onInitializationSucceeded();
        }
    }

    public static TTAdManager getPangleSdkManager() {
        return TTAdSdk.getAdManager();
    }

    public static void setCcpa(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != -1) {
            Log.w(TAG, "Invalid CCPA value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (TTAdSdk.isInitSuccess()) {
            TTAdSdk.setCCPA(i10);
        }
        f20700g = i10;
    }

    public static void setCoppa(int i10) {
        if (i10 == 0) {
            if (TTAdSdk.isInitSuccess()) {
                TTAdSdk.setCoppa(0);
            }
            f20698e = 0;
        } else if (i10 != 1) {
            if (TTAdSdk.isInitSuccess()) {
                TTAdSdk.setCoppa(-1);
            }
            f20698e = -1;
        } else {
            if (TTAdSdk.isInitSuccess()) {
                TTAdSdk.setCoppa(1);
            }
            f20698e = 1;
        }
    }

    public static void setGdpr(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != -1) {
            Log.w(TAG, "Invalid GDPR value. Pangle SDK only accepts -1, 0 or 1.");
            return;
        }
        if (TTAdSdk.isInitSuccess()) {
            TTAdSdk.setGdpr(i10);
        }
        f20699f = i10;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(getPangleSdkManager().getBiddingToken());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sDKVersion = TTAdSdk.getAdManager().getSDKVersion();
        String[] split = sDKVersion.split("\\.");
        if (split.length >= 3) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = Integer.parseInt(split[2]);
            if (split.length >= 4) {
                parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[3]);
            }
            return new VersionInfo(parseInt, parseInt2, parseInt3);
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sDKVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] split = "4.5.0.6.1".split("\\.");
        if (split.length >= 4) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]);
            if (split.length >= 5) {
                parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[4]);
            }
            return new VersionInfo(parseInt, parseInt2, parseInt3);
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", "4.5.0.6.1"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            AdError a10 = m7.a.a(101, "Missing or invalid App ID.");
            Log.w(TAG, a10.toString());
            initializationCompleteCallback.onInitializationFailed(a10.toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Found multiple app IDs in %s. Using %s to initialize Pangle SDK.", hashSet, str));
        }
        setCoppa(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
        TTAdSdk.init(context, new TTAdConfig.Builder().appId(str).coppa(f20698e).setGDPR(f20699f).setCCPA(f20700g).build(), new a(this, initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        n7.a aVar = new n7.a(mediationBannerAdConfiguration, mediationAdLoadCallback);
        this.f20701a = aVar;
        aVar.b();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        b bVar = new b(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.f20702b = bVar;
        bVar.e();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        c cVar = new c(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.f20704d = cVar;
        cVar.g();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        d dVar = new d(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.f20703c = dVar;
        dVar.e();
    }
}
