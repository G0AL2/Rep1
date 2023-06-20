package com.google.ads.mediation.ironsource;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.ironsource.b;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class IronSourceMediationAdapter extends Adapter implements MediationRewardedAd {
    public static final int ERROR_AD_ALREADY_LOADED = 103;
    public static final int ERROR_AD_SHOW_UNAUTHORIZED = 104;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.ironsource";
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 102;
    public static final String IRONSOURCE_SDK_ERROR_DOMAIN = "com.ironsource.mediationsdk";

    /* renamed from: a  reason: collision with root package name */
    private MediationRewardedAdCallback f20671a;

    /* renamed from: b  reason: collision with root package name */
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f20672b;

    /* renamed from: c  reason: collision with root package name */
    private String f20673c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdError f20674a;

        a(AdError adError) {
            this.f20674a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceMediationAdapter.this.f20672b != null) {
                IronSourceMediationAdapter.this.f20672b.onFailure(this.f20674a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdError f20676a;

        b(AdError adError) {
            this.f20676a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceMediationAdapter.this.f20671a != null) {
                IronSourceMediationAdapter.this.f20671a.onAdFailedToShow(this.f20676a);
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f20678a;

        c(IronSourceMediationAdapter ironSourceMediationAdapter, InitializationCompleteCallback initializationCompleteCallback) {
            this.f20678a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.ironsource.b.a
        public void a(AdError adError) {
            this.f20678a.onInitializationFailed(adError.getMessage());
        }

        @Override // com.google.ads.mediation.ironsource.b.a
        public void b() {
            this.f20678a.onInitializationSucceeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediationAdLoadCallback f20679a;

        d(MediationAdLoadCallback mediationAdLoadCallback) {
            this.f20679a = mediationAdLoadCallback;
        }

        @Override // com.google.ads.mediation.ironsource.b.a
        public void a(AdError adError) {
            Log.e(com.google.ads.mediation.ironsource.a.f20691a, adError.getMessage());
            this.f20679a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.ironsource.b.a
        public void b() {
            IronSourceMediationAdapter.this.f20672b = this.f20679a;
            Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("Loading IronSource rewarded ad with instance ID: %s", IronSourceMediationAdapter.this.f20673c));
            com.google.ads.mediation.ironsource.b.c().f(IronSourceMediationAdapter.this.f20673c, IronSourceMediationAdapter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceMediationAdapter.this.f20672b != null) {
                IronSourceMediationAdapter ironSourceMediationAdapter = IronSourceMediationAdapter.this;
                ironSourceMediationAdapter.f20671a = (MediationRewardedAdCallback) ironSourceMediationAdapter.f20672b.onSuccess(IronSourceMediationAdapter.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdError f20682a;

        f(AdError adError) {
            this.f20682a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceMediationAdapter.this.f20672b != null) {
                IronSourceMediationAdapter.this.f20672b.onFailure(this.f20682a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceMediationAdapter.this.f20671a != null) {
                IronSourceMediationAdapter.this.f20671a.onAdOpened();
                IronSourceMediationAdapter.this.f20671a.onVideoStart();
                IronSourceMediationAdapter.this.f20671a.reportAdImpression();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceMediationAdapter.this.f20671a != null) {
                IronSourceMediationAdapter.this.f20671a.onAdClosed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f20686a;

        i(l lVar) {
            this.f20686a = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceMediationAdapter.this.f20671a != null) {
                IronSourceMediationAdapter.this.f20671a.onVideoComplete();
                IronSourceMediationAdapter.this.f20671a.onUserEarnedReward(this.f20686a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdError f20688a;

        j(AdError adError) {
            this.f20688a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceMediationAdapter.this.f20671a != null) {
                IronSourceMediationAdapter.this.f20671a.onAdFailedToShow(this.f20688a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceMediationAdapter.this.f20671a != null) {
                IronSourceMediationAdapter.this.f20671a.reportAdClicked();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class l implements RewardItem {
        l() {
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public int getAmount() {
            return 1;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public String getType() {
            return "";
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sDKVersion = IronSourceUtils.getSDKVersion();
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
        Log.w(com.google.ads.mediation.ironsource.a.f20691a, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sDKVersion));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] split = "7.2.3.1.0".split("\\.");
        if (split.length >= 4) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]);
            if (split.length >= 5) {
                parseInt3 = (parseInt3 * 100) + Integer.parseInt(split[4]);
            }
            return new VersionInfo(parseInt, parseInt2, parseInt3);
        }
        Log.w(com.google.ads.mediation.ironsource.a.f20691a, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", "7.2.3.1.0"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.getServerParameters().getString("appKey");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", ERROR_DOMAIN).getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(com.google.ads.mediation.ironsource.a.f20691a, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the IronSource SDK.", "appKey", hashSet, str));
        }
        com.google.ads.mediation.ironsource.b.c().d(context, str, new c(this, initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        Context context = mediationRewardedAdConfiguration.getContext();
        String string = serverParameters.getString("appKey");
        this.f20673c = serverParameters.getString(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, "0");
        com.google.ads.mediation.ironsource.b.c().d(context, string, new d(mediationAdLoadCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, "IronSource adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from IronSource.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    public void onAdFailedToLoad(AdError adError) {
        Log.e(com.google.ads.mediation.ironsource.a.f20691a, adError.getMessage());
        com.google.ads.mediation.ironsource.a.a(new a(adError));
    }

    public void onAdFailedToShow(AdError adError) {
        Log.e(com.google.ads.mediation.ironsource.a.f20691a, adError.getMessage());
        com.google.ads.mediation.ironsource.a.a(new b(adError));
    }

    public void onRewardedVideoAdClicked(String str) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource rewarded ad clicked for instance ID: %s", str));
        com.google.ads.mediation.ironsource.a.a(new k());
    }

    public void onRewardedVideoAdClosed(String str) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource rewarded ad closed for instance ID: %s", str));
        com.google.ads.mediation.ironsource.a.a(new h());
    }

    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource failed to load rewarded ad for instance ID: %s. Error: %s", str, adError.getMessage()));
        com.google.ads.mediation.ironsource.a.a(new f(adError));
    }

    public void onRewardedVideoAdLoadSuccess(String str) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource rewarded ad loaded for instance ID: %s", str));
        com.google.ads.mediation.ironsource.a.a(new e());
    }

    public void onRewardedVideoAdOpened(String str) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource rewarded ad opened for instance ID: %s", str));
        com.google.ads.mediation.ironsource.a.a(new g());
    }

    public void onRewardedVideoAdRewarded(String str) {
        l lVar = new l();
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource rewarded ad received reward: %d %s, for instance ID: %s", Integer.valueOf(lVar.getAmount()), lVar.getType(), str));
        com.google.ads.mediation.ironsource.a.a(new i(lVar));
    }

    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource failed to show rewarded ad for instance ID: %s. Error: %s", str, adError.getMessage()));
        com.google.ads.mediation.ironsource.a.a(new j(adError));
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("Showing IronSource rewarded ad for instance ID: %s", this.f20673c));
        com.google.ads.mediation.ironsource.b.c().j(this.f20673c, this);
    }
}
