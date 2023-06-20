package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    private final m f7799b;

    /* renamed from: c  reason: collision with root package name */
    private final v f7800c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7801d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.mediation.a.f f7802e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7803f;

    /* renamed from: g  reason: collision with root package name */
    private MaxAdapter f7804g;

    /* renamed from: h  reason: collision with root package name */
    private String f7805h;

    /* renamed from: i  reason: collision with root package name */
    private com.applovin.impl.mediation.a.a f7806i;

    /* renamed from: j  reason: collision with root package name */
    private View f7807j;

    /* renamed from: k  reason: collision with root package name */
    private MaxNativeAd f7808k;

    /* renamed from: l  reason: collision with root package name */
    private MaxNativeAdView f7809l;

    /* renamed from: n  reason: collision with root package name */
    private MaxAdapterResponseParameters f7811n;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f7815r;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f7798a = new Handler(Looper.getMainLooper());

    /* renamed from: m  reason: collision with root package name */
    private final a f7810m = new a(this, null);

    /* renamed from: o  reason: collision with root package name */
    private final AtomicBoolean f7812o = new AtomicBoolean(true);

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f7813p = new AtomicBoolean(false);

    /* renamed from: q  reason: collision with root package name */
    private final AtomicBoolean f7814q = new AtomicBoolean(false);

    /* renamed from: com.applovin.impl.mediation.g$1  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaxAdapterInitializationParameters f7816a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f7817b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Runnable f7818c;

        AnonymousClass1(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, Runnable runnable) {
            this.f7816a = maxAdapterInitializationParameters;
            this.f7817b = activity;
            this.f7818c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.b("MediationAdapterWrapper", "Initializing " + g.this.f7803f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + g.this.f7802e.S());
            }
            g.this.f7804g.initialize(this.f7816a, this.f7817b, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.g.1.1
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.g.1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            C01271 c01271 = C01271.this;
                            g.this.f7799b.D().a(g.this.f7802e, elapsedRealtime2 - elapsedRealtime, initializationStatus, str);
                            Runnable runnable = AnonymousClass1.this.f7818c;
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                    }, g.this.f7802e.X());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements MaxAdViewAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {

        /* renamed from: b  reason: collision with root package name */
        private MediationServiceImpl.a f7873b;

        private a() {
        }

        /* synthetic */ a(g gVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(MediationServiceImpl.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No listener specified");
            }
            this.f7873b = aVar;
        }

        private void a(String str, final Bundle bundle) {
            g.this.f7814q.set(true);
            a(str, this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (g.this.f7813p.compareAndSet(false, true)) {
                        a.this.f7873b.a(g.this.f7806i, bundle);
                    }
                }
            });
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            g.this.f7798a.post(new Runnable() { // from class: com.applovin.impl.mediation.g.a.14
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e10) {
                        MaxAdListener maxAdListener2 = maxAdListener;
                        String name = maxAdListener2 != null ? maxAdListener2.getClass().getName() : null;
                        if (v.a()) {
                            v.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, e10);
                        }
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            a(str, this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.12
                @Override // java.lang.Runnable
                public void run() {
                    if (g.this.f7813p.compareAndSet(false, true)) {
                        a.this.f7873b.onAdLoadFailed(g.this.f7805h, maxError);
                    }
                }
            });
        }

        private void b(String str, final Bundle bundle) {
            if (g.this.f7806i.s().compareAndSet(false, true)) {
                a(str, this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.15
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f7873b.b(g.this.f7806i, bundle);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, final MaxError maxError) {
            a(str, this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.16
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.onAdDisplayFailed(g.this.f7806i, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.8
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.d(g.this.f7806i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.11
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.onAdCollapsed(g.this.f7806i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.d("MediationAdapterWrapper", g.this.f7803f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            b("onAdViewAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": adview ad displayed with extra info: " + bundle);
            }
            b("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.10
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.onAdExpanded(g.this.f7806i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(final Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": adview ad hidden with extra info: " + bundle);
            }
            a("onAdViewAdHidden", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.9
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.c(g.this.f7806i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.d("MediationAdapterWrapper", g.this.f7803f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": adview ad loaded with extra info: " + bundle);
            }
            g.this.f7807j = view;
            a("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.17
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.d(g.this.f7806i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.d("MediationAdapterWrapper", g.this.f7803f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            b("onInterstitialAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": interstitial ad displayed with extra info: " + bundle);
            }
            b("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(final Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": interstitial ad hidden with extra info " + bundle);
            }
            a("onInterstitialAdHidden", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.18
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.c(g.this.f7806i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.d("MediationAdapterWrapper", g.this.f7803f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": interstitial ad loaded with extra info: " + bundle);
            }
            a("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": native ad clicked");
            }
            a("onNativeAdClicked", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.13
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.onAdClicked(g.this.f7806i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": native ad displayed with extra info: " + bundle);
            }
            b("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.d("MediationAdapterWrapper", g.this.f7803f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": native ad loaded with extra info: " + bundle);
            }
            g.this.f7808k = maxNativeAd;
            a("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.19
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.d(g.this.f7806i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.d("MediationAdapterWrapper", g.this.f7803f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            b("onRewardedAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded ad displayed with extra info: " + bundle);
            }
            b("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(final Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded ad hidden with extra info: " + bundle);
            }
            a("onRewardedAdHidden", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.20
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.c(g.this.f7806i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.d("MediationAdapterWrapper", g.this.f7803f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded ad loaded with extra info: " + bundle);
            }
            a("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded video completed");
            }
            a("onRewardedAdVideoCompleted", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.onRewardedVideoCompleted(g.this.f7806i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded video started");
            }
            a("onRewardedAdVideoStarted", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.onRewardedVideoStarted(g.this.f7806i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(final Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdClicked", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.4
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.d(g.this.f7806i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.d("MediationAdapterWrapper", g.this.f7803f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            b("onRewardedInterstitialAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            b("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(final Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdHidden", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.5
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.c(g.this.f7806i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.d("MediationAdapterWrapper", g.this.f7803f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded interstitial completed");
            }
            a("onRewardedInterstitialAdVideoCompleted", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.7
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.onRewardedVideoCompleted(g.this.f7806i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            if (v.a()) {
                v vVar = g.this.f7800c;
                vVar.c("MediationAdapterWrapper", g.this.f7803f + ": rewarded interstitial started");
            }
            a("onRewardedInterstitialAdVideoStarted", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.6
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f7873b.onRewardedVideoStarted(g.this.f7806i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(final MaxReward maxReward) {
            if (g.this.f7806i instanceof com.applovin.impl.mediation.a.c) {
                final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) g.this.f7806i;
                if (cVar.H().compareAndSet(false, true)) {
                    if (v.a()) {
                        v vVar = g.this.f7800c;
                        vVar.c("MediationAdapterWrapper", g.this.f7803f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", this.f7873b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.21
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.f7873b.onUserRewarded(cVar, maxReward);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final com.applovin.impl.mediation.a.h f7912a;

        /* renamed from: b  reason: collision with root package name */
        private final MaxSignalCollectionListener f7913b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f7914c = new AtomicBoolean();

        b(com.applovin.impl.mediation.a.h hVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f7912a = hVar;
            this.f7913b = maxSignalCollectionListener;
        }
    }

    /* loaded from: classes.dex */
    private class c extends com.applovin.impl.sdk.e.a {
        private c() {
            super("TaskTimeoutMediatedAd", g.this.f7799b);
        }

        /* synthetic */ c(g gVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        private void a(com.applovin.impl.mediation.a.a aVar) {
            if (aVar != null) {
                this.f8349b.H().a(aVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f7813p.get()) {
                return;
            }
            if (g.this.f7806i.k()) {
                if (v.a()) {
                    a(g.this.f7803f + " is timing out, considering JS Tag ad loaded: " + g.this.f7806i);
                }
                a(g.this.f7806i);
                return;
            }
            if (v.a()) {
                d(g.this.f7803f + " is timing out " + g.this.f7806i + "...");
            }
            a(g.this.f7806i);
            g.this.f7810m.a(e(), new MaxErrorImpl(-5101, "Adapter timed out"));
        }
    }

    /* loaded from: classes.dex */
    private class d extends com.applovin.impl.sdk.e.a {

        /* renamed from: c  reason: collision with root package name */
        private final b f7917c;

        private d(b bVar) {
            super("TaskTimeoutSignalCollection", g.this.f7799b);
            this.f7917c = bVar;
        }

        /* synthetic */ d(g gVar, b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7917c.f7914c.get()) {
                return;
            }
            if (v.a()) {
                d(g.this.f7803f + " is timing out " + this.f7917c.f7912a + "...");
            }
            g gVar = g.this;
            gVar.b("The adapter (" + g.this.f7803f + ") timed out", this.f7917c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.applovin.impl.mediation.a.f fVar, MaxAdapter maxAdapter, boolean z10, m mVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f7801d = fVar.L();
        this.f7804g = maxAdapter;
        this.f7799b = mVar;
        this.f7800c = mVar.A();
        this.f7802e = fVar;
        this.f7803f = maxAdapter.getClass().getSimpleName();
        this.f7815r = z10;
    }

    private void a(final Runnable runnable, final com.applovin.impl.mediation.a.a aVar) {
        a("show_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str = "Failed to start displaying ad" + aVar + " : " + th;
                    if (v.a()) {
                        v.i("MediationAdapterWrapper", str);
                    }
                    g.this.f7810m.b("show_ad", new MaxErrorImpl(-1, str));
                    g.this.a("show_ad");
                    g.this.f7799b.C().a(g.this.f7802e.K(), "show_ad", g.this.f7806i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (v.a()) {
            v vVar = this.f7800c;
            vVar.c("MediationAdapterWrapper", "Marking " + this.f7803f + " as disabled due to: " + str);
        }
        this.f7812o.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, b bVar) {
        if (!bVar.f7914c.compareAndSet(false, true) || bVar.f7913b == null) {
            return;
        }
        bVar.f7913b.onSignalCollected(str);
    }

    private void a(final String str, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.g.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (v.a()) {
                        v vVar = g.this.f7800c;
                        vVar.b("MediationAdapterWrapper", g.this.f7803f + ": running " + str + "...");
                    }
                    runnable.run();
                    if (v.a()) {
                        v vVar2 = g.this.f7800c;
                        vVar2.b("MediationAdapterWrapper", g.this.f7803f + ": finished " + str + "");
                    }
                } catch (Throwable th) {
                    if (v.a()) {
                        v.c("MediationAdapterWrapper", "Unable to run adapter operation " + str + ", marking " + g.this.f7803f + " as disabled", th);
                    }
                    g gVar = g.this;
                    gVar.a("fail_" + str);
                    if (str.equals("destroy")) {
                        return;
                    }
                    g.this.f7799b.C().a(g.this.f7802e.K(), str, g.this.f7806i);
                }
            }
        };
        if (this.f7802e.S()) {
            this.f7798a.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, b bVar) {
        if (!bVar.f7914c.compareAndSet(false, true) || bVar.f7913b == null) {
            return;
        }
        bVar.f7913b.onSignalCollectionFailed(str);
    }

    private boolean b(com.applovin.impl.mediation.a.a aVar, Activity activity) {
        MaxErrorImpl maxErrorImpl;
        if (aVar != null) {
            if (aVar.g() == null) {
                if (v.a()) {
                    v.i("MediationAdapterWrapper", "Adapter has been garbage collected");
                }
                maxErrorImpl = new MaxErrorImpl(-1, "Adapter has been garbage collected");
            } else if (aVar.g() != this) {
                throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
            } else {
                if (activity == null) {
                    throw new IllegalArgumentException("No activity specified");
                }
                if (this.f7812o.get()) {
                    if (g()) {
                        return true;
                    }
                    throw new IllegalStateException("Mediation adapter '" + this.f7803f + "' does not have an ad loaded. Please load an ad first");
                }
                String str = "Mediation adapter '" + this.f7803f + "' is disabled. Showing ads with this adapter is disabled.";
                if (v.a()) {
                    v.i("MediationAdapterWrapper", str);
                }
                maxErrorImpl = new MaxErrorImpl(-1, str);
            }
            this.f7810m.b("ad_show", maxErrorImpl);
            return false;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public View a() {
        return this.f7807j;
    }

    public void a(com.applovin.impl.mediation.a.a aVar, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.15
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdapter) g.this.f7804g).showInterstitialAd(g.this.f7811n, activity, g.this.f7810m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.16
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdapter) g.this.f7804g).showRewardedAd(g.this.f7811n, activity, g.this.f7810m);
                    }
                };
            } else if (aVar.getFormat() != MaxAdFormat.REWARDED_INTERSTITIAL) {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            } else {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) g.this.f7804g).showRewardedInterstitialAd(g.this.f7811n, activity, g.this.f7810m);
                    }
                };
            }
            a(runnable, aVar);
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar, final ViewGroup viewGroup, final i iVar, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) g.this.f7804g).showInterstitialAd(g.this.f7811n, viewGroup, iVar, activity, g.this.f7810m);
                    }
                };
            } else if (aVar.getFormat() != MaxAdFormat.REWARDED) {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            } else {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdViewAdapter) g.this.f7804g).showRewardedAd(g.this.f7811n, viewGroup, iVar, activity, g.this.f7810m);
                    }
                };
            }
            a(runnable, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, Runnable runnable) {
        a("initialize", new AnonymousClass1(maxAdapterInitializationParameters, activity, runnable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final com.applovin.impl.mediation.a.h hVar, final Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (this.f7812o.get()) {
            final b bVar = new b(hVar, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f7804g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                a("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.g.6
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.g.6.1
                                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                                public void onSignalCollected(String str) {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    g.this.a(str, bVar);
                                }

                                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                                public void onSignalCollectionFailed(String str) {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    g.this.b(str, bVar);
                                }
                            });
                        } catch (Throwable th) {
                            g gVar = g.this;
                            gVar.b("Failed signal collection for " + g.this.f7801d + " due to exception: " + th, bVar);
                            g.this.a("collect_signal");
                            g.this.f7799b.C().a(g.this.f7802e.K(), "collect_signal", g.this.f7806i);
                        }
                        if (bVar.f7914c.get()) {
                            return;
                        }
                        if (hVar.W() == 0) {
                            if (v.a()) {
                                v vVar = g.this.f7800c;
                                vVar.b("MediationAdapterWrapper", "Failing signal collection " + hVar + " since it has 0 timeout");
                            }
                            g gVar2 = g.this;
                            gVar2.b("The adapter (" + g.this.f7803f + ") has 0 timeout", bVar);
                            return;
                        }
                        int i10 = (hVar.W() > 0L ? 1 : (hVar.W() == 0L ? 0 : -1));
                        boolean a10 = v.a();
                        if (i10 <= 0) {
                            if (a10) {
                                v vVar2 = g.this.f7800c;
                                vVar2.b("MediationAdapterWrapper", "Negative timeout set for " + hVar + ", not scheduling a timeout");
                                return;
                            }
                            return;
                        }
                        if (a10) {
                            v vVar3 = g.this.f7800c;
                            vVar3.b("MediationAdapterWrapper", "Setting timeout " + hVar.W() + "ms. for " + hVar);
                        }
                        g.this.f7799b.S().a(new d(g.this, bVar, null), o.a.MEDIATION_TIMEOUT, hVar.W());
                    }
                });
                return;
            }
            b("The adapter (" + this.f7803f + ") does not support signal collection", bVar);
            return;
        }
        if (v.a()) {
            v.i("MediationAdapterWrapper", "Mediation adapter '" + this.f7803f + "' is disabled. Signal collection ads with this adapter is disabled.");
        }
        maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f7803f + ") is disabled");
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f7809l = maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, com.applovin.impl.mediation.a.a aVar) {
        this.f7805h = str;
        this.f7806i = aVar;
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final com.applovin.impl.mediation.a.a aVar, final Activity activity, MediationServiceImpl.a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (!this.f7812o.get()) {
            String str2 = "Mediation adapter '" + this.f7803f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            if (v.a()) {
                v.i("MediationAdapterWrapper", str2);
            }
            aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
            return;
        }
        this.f7811n = maxAdapterResponseParameters;
        this.f7810m.a(aVar2);
        if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.9
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxInterstitialAdapter) g.this.f7804g).loadInterstitialAd(maxAdapterResponseParameters, activity, g.this.f7810m);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.10
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedAdapter) g.this.f7804g).loadRewardedAd(maxAdapterResponseParameters, activity, g.this.f7810m);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.11
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedInterstitialAdapter) g.this.f7804g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, g.this.f7810m);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.NATIVE) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.12
                @Override // java.lang.Runnable
                public void run() {
                    ((MediationAdapterBase) g.this.f7804g).loadNativeAd(maxAdapterResponseParameters, activity, g.this.f7810m);
                }
            };
        } else if (!aVar.getFormat().isAdViewAd()) {
            throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
        } else {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.13
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxAdViewAdapter) g.this.f7804g).loadAdViewAd(maxAdapterResponseParameters, aVar.getFormat(), activity, g.this.f7810m);
                }
            };
        }
        a("load_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str3 = "Failed start loading " + aVar + " : " + th;
                    if (v.a()) {
                        v.i("MediationAdapterWrapper", str3);
                    }
                    g.this.f7810m.a("load_ad", new MaxErrorImpl(-1, str3));
                    g.this.a("load_ad");
                    g.this.f7799b.C().a(g.this.f7802e.K(), "load_ad", g.this.f7806i);
                }
                if (g.this.f7813p.get()) {
                    return;
                }
                long W = g.this.f7802e.W();
                if (W <= 0) {
                    if (v.a()) {
                        g.this.f7800c.b("MediationAdapterWrapper", "Negative timeout set for " + aVar + ", not scheduling a timeout");
                        return;
                    }
                    return;
                }
                if (v.a()) {
                    g.this.f7800c.b("MediationAdapterWrapper", "Setting timeout " + W + "ms. for " + aVar);
                }
                g.this.f7799b.S().a(new c(g.this, null), o.a.MEDIATION_TIMEOUT, W);
            }
        });
    }

    public MaxNativeAd b() {
        return this.f7808k;
    }

    public MaxNativeAdView c() {
        return this.f7809l;
    }

    public String d() {
        return this.f7801d;
    }

    public MediationServiceImpl.a e() {
        return this.f7810m.f7873b;
    }

    public boolean f() {
        return this.f7812o.get();
    }

    public boolean g() {
        return this.f7813p.get() && this.f7814q.get();
    }

    public String h() {
        MaxAdapter maxAdapter = this.f7804g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getSdkVersion();
            } catch (Throwable th) {
                if (v.a()) {
                    v.c("MediationAdapterWrapper", "Unable to get adapter's SDK version, marking " + this + " as disabled", th);
                }
                a("sdk_version");
                this.f7799b.C().a(this.f7802e.K(), "sdk_version", this.f7806i);
                return null;
            }
        }
        return null;
    }

    public String i() {
        MaxAdapter maxAdapter = this.f7804g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getAdapterVersion();
            } catch (Throwable th) {
                if (v.a()) {
                    v.c("MediationAdapterWrapper", "Unable to get adapter version, marking " + this + " as disabled", th);
                }
                a("adapter_version");
                this.f7799b.C().a(this.f7802e.K(), "adapter_version", this.f7806i);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        if (this.f7815r) {
            return;
        }
        a("destroy", new Runnable() { // from class: com.applovin.impl.mediation.g.7
            @Override // java.lang.Runnable
            public void run() {
                g.this.a("destroy");
                g.this.f7804g.onDestroy();
                g.this.f7804g = null;
                g.this.f7807j = null;
                g.this.f7808k = null;
                g.this.f7809l = null;
            }
        });
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f7803f + "'}";
    }
}
