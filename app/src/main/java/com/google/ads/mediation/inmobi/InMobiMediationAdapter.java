package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.inmobi.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class InMobiMediationAdapter extends Adapter {
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.inmobi";
    public static final String INMOBI_SDK_ERROR_DOMAIN = "com.inmobi.sdk";
    public static final String TAG = "InMobiMediationAdapter";

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f20619b = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    private h f20620a;

    /* loaded from: classes2.dex */
    class a implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InitializationCompleteCallback f20621a;

        a(InMobiMediationAdapter inMobiMediationAdapter, InitializationCompleteCallback initializationCompleteCallback) {
            this.f20621a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void a(AdError adError) {
            this.f20621a.onInitializationFailed(adError.getMessage());
        }

        @Override // com.google.ads.mediation.inmobi.d.b
        public void b() {
            InMobiMediationAdapter.f20619b.set(true);
            this.f20621a.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String version = InMobiSdk.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", version));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] split = "10.0.7.0".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), (Integer.parseInt(split[2]) * 100) + Integer.parseInt(split[3]));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", "10.0.7.0"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (f20619b.get()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.getServerParameters().getString("accountid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(100, "Missing or Invalid Account ID.", ERROR_DOMAIN).getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the InMobi SDK", "accountid", hashSet, str));
        }
        d.c().d(context, str, new a(this, initializationCompleteCallback));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        h hVar = new h(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.f20620a = hVar;
        hVar.f();
    }
}
