package com.google.ads.mediation.unity;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class UnityMediationAdapter extends Adapter {
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.unity";
    static final int ERROR_AD_ALREADY_LOADING = 108;
    static final int ERROR_AD_NOT_READY = 106;
    static final int ERROR_BANNER_SIZE_MISMATCH = 110;
    static final int ERROR_CONTEXT_NOT_ACTIVITY = 105;
    static final int ERROR_FINISH = 109;
    static final int ERROR_INITIALIZATION_FAILURE = 111;
    static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    static final int ERROR_NULL_CONTEXT = 104;
    static final int ERROR_PLACEMENT_STATE_DISABLED = 103;
    static final int ERROR_PLACEMENT_STATE_NO_FILL = 102;
    static final int ERROR_UNITY_ADS_NOT_SUPPORTED = 107;
    static final String KEY_GAME_ID = "gameId";
    static final String KEY_PLACEMENT_ID = "zoneId";
    public static final String SDK_ERROR_DOMAIN = "com.unity3d.ads";
    static final String TAG = "UnityMediationAdapter";
    private d rewardedAd;

    /* loaded from: classes2.dex */
    class a implements IUnityAdsInitializationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f20714a;

        a(UnityMediationAdapter unityMediationAdapter, InitializationCompleteCallback initializationCompleteCallback) {
            this.f20714a = initializationCompleteCallback;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            Log.d(UnityMediationAdapter.TAG, "Unity Ads initialized successfully.");
            this.f20714a.onInitializationSucceeded();
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError b10 = com.google.ads.mediation.unity.a.b(unityAdsInitializationError, "Unity Ads initialization failed: [" + unityAdsInitializationError + "] " + str);
            Log.d(UnityMediationAdapter.TAG, b10.toString());
            this.f20714a.onInitializationFailed(b10.toString());
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String version = UnityAds.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", version));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] split = "4.2.1.1".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", "4.2.1.1"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        String str;
        HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.getServerParameters().getString(KEY_GAME_ID);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the UnityAds SDK", KEY_GAME_ID, hashSet, str));
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid Game ID.", ADAPTER_ERROR_DOMAIN).toString());
        } else {
            b.a().b(context, str, new a(this, initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        d dVar = new d();
        this.rewardedAd = dVar;
        dVar.f(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }
}
