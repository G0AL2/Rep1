package com.google.android.ads.mediationtestsuite.utils;

import android.app.Activity;
import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import org.jspecify.nullness.Nullable;

/* compiled from: InterstitialAdManager.java */
/* loaded from: classes2.dex */
public class f extends com.google.android.ads.mediationtestsuite.utils.a {

    /* renamed from: f  reason: collision with root package name */
    private InterstitialAd f20928f;

    /* compiled from: InterstitialAdManager.java */
    /* loaded from: classes2.dex */
    class a extends InterstitialAdLoadCallback {
        a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            f.this.f20905d.onAdFailedToLoad(loadAdError);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            f.this.f20928f = interstitialAd;
            f.this.f20905d.onAdLoaded();
        }
    }

    public f(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
        super(networkConfig, aVar);
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    @Nullable
    protected String c() {
        InterstitialAd interstitialAd = this.f20928f;
        if (interstitialAd == null) {
            return null;
        }
        return interstitialAd.getResponseInfo().getMediationAdapterClassName();
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    public void e(Context context) {
        this.f20928f = null;
        InterstitialAd.load(context, this.f20902a.h(), this.f20904c, new a());
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    public void f(Activity activity) {
        InterstitialAd interstitialAd = this.f20928f;
        if (interstitialAd != null) {
            interstitialAd.show(activity);
        }
    }
}
