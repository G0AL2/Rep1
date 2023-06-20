package com.google.ads.mediation.ironsource;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.ironsource.b;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public class IronSourceAdapter implements MediationInterstitialAdapter {

    /* renamed from: a  reason: collision with root package name */
    private MediationInterstitialListener f20657a;

    /* renamed from: b  reason: collision with root package name */
    private String f20658b;

    /* loaded from: classes2.dex */
    class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Bundle f20659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediationInterstitialListener f20660b;

        a(Bundle bundle, MediationInterstitialListener mediationInterstitialListener) {
            this.f20659a = bundle;
            this.f20660b = mediationInterstitialListener;
        }

        @Override // com.google.ads.mediation.ironsource.b.a
        public void a(AdError adError) {
            Log.e(com.google.ads.mediation.ironsource.a.f20691a, adError.getMessage());
            this.f20660b.onAdFailedToLoad(IronSourceAdapter.this, adError);
        }

        @Override // com.google.ads.mediation.ironsource.b.a
        public void b() {
            IronSourceAdapter.this.f20658b = this.f20659a.getString(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, "0");
            IronSourceAdapter.this.f20657a = this.f20660b;
            Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("Loading IronSource interstitial ad with instance ID: %s", IronSourceAdapter.this.f20658b));
            com.google.ads.mediation.ironsource.b.c().e(IronSourceAdapter.this.f20658b, IronSourceAdapter.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceAdapter.this.f20657a != null) {
                IronSourceAdapter.this.f20657a.onAdLoaded(IronSourceAdapter.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdError f20663a;

        c(AdError adError) {
            this.f20663a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceAdapter.this.f20657a != null) {
                IronSourceAdapter.this.f20657a.onAdFailedToLoad(IronSourceAdapter.this, this.f20663a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceAdapter.this.f20657a != null) {
                IronSourceAdapter.this.f20657a.onAdOpened(IronSourceAdapter.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceAdapter.this.f20657a != null) {
                IronSourceAdapter.this.f20657a.onAdClosed(IronSourceAdapter.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceAdapter.this.f20657a != null) {
                IronSourceAdapter.this.f20657a.onAdOpened(IronSourceAdapter.this);
                IronSourceAdapter.this.f20657a.onAdClosed(IronSourceAdapter.this);
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
            if (IronSourceAdapter.this.f20657a != null) {
                IronSourceAdapter.this.f20657a.onAdClicked(IronSourceAdapter.this);
                IronSourceAdapter.this.f20657a.onAdLeftApplication(IronSourceAdapter.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdError f20669a;

        h(AdError adError) {
            this.f20669a = adError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (IronSourceAdapter.this.f20657a != null) {
                IronSourceAdapter.this.f20657a.onAdFailedToLoad(IronSourceAdapter.this, this.f20669a);
            }
        }
    }

    public void onAdFailedToLoad(AdError adError) {
        Log.e(com.google.ads.mediation.ironsource.a.f20691a, adError.getMessage());
        com.google.ads.mediation.ironsource.a.a(new h(adError));
    }

    public void onAdFailedToShow(AdError adError) {
        Log.e(com.google.ads.mediation.ironsource.a.f20691a, adError.getMessage());
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    public void onInterstitialAdClicked(String str) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource Interstitial ad clicked for instance ID: %s", str));
        com.google.ads.mediation.ironsource.a.a(new g());
    }

    public void onInterstitialAdClosed(String str) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource Interstitial ad closed for instance ID: %s", str));
        com.google.ads.mediation.ironsource.a.a(new e());
    }

    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource failed to load interstitial ad for instance ID: %s. Error: %s", str, adError.getMessage()));
        com.google.ads.mediation.ironsource.a.a(new c(adError));
    }

    public void onInterstitialAdOpened(String str) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource Interstitial ad opened for instance ID: %s", str));
        com.google.ads.mediation.ironsource.a.a(new d());
    }

    public void onInterstitialAdReady(String str) {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource Interstitial ad loaded for instance ID: %s", str));
        com.google.ads.mediation.ironsource.a.a(new b());
    }

    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        Log.e(com.google.ads.mediation.ironsource.a.f20691a, String.format("IronSource failed to show interstitial ad for instance ID: %s. Error: %s", str, new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN).getMessage()));
        com.google.ads.mediation.ironsource.a.a(new f());
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        com.google.ads.mediation.ironsource.b.c().d(context, bundle.getString("appKey"), new a(bundle, mediationInterstitialListener));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        Log.d(com.google.ads.mediation.ironsource.a.f20691a, String.format("Showing IronSource interstitial ad for instance ID: %s", this.f20658b));
        com.google.ads.mediation.ironsource.b.c().i(this.f20658b);
    }
}
