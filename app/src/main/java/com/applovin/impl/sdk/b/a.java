package com.applovin.impl.sdk.b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.ad.f;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.e.aa;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    protected final m f8126a;

    /* renamed from: b  reason: collision with root package name */
    protected final AppLovinAdServiceImpl f8127b;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAd f8128c;

    /* renamed from: d  reason: collision with root package name */
    private String f8129d;

    /* renamed from: e  reason: collision with root package name */
    private SoftReference<AppLovinAdLoadListener> f8130e;

    /* renamed from: g  reason: collision with root package name */
    private volatile String f8132g;

    /* renamed from: f  reason: collision with root package name */
    private final Object f8131f = new Object();

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f8133h = false;

    /* renamed from: com.applovin.impl.sdk.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0129a implements AppLovinAdLoadListener {

        /* renamed from: b  reason: collision with root package name */
        private final AppLovinAdLoadListener f8136b;

        C0129a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f8136b = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            a.this.f8128c = appLovinAd;
            if (this.f8136b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0129a.this.f8136b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            if (v.a()) {
                                v.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                            }
                        }
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i10) {
            if (this.f8136b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C0129a.this.f8136b.failedToReceiveAd(i10);
                        } catch (Throwable th) {
                            if (v.a()) {
                                v.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements g, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b  reason: collision with root package name */
        private final AppLovinAdDisplayListener f8142b;

        /* renamed from: c  reason: collision with root package name */
        private final AppLovinAdClickListener f8143c;

        /* renamed from: d  reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f8144d;

        /* renamed from: e  reason: collision with root package name */
        private final AppLovinAdRewardListener f8145e;

        private b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f8142b = appLovinAdDisplayListener;
            this.f8143c = appLovinAdClickListener;
            this.f8144d = appLovinAdVideoPlaybackListener;
            this.f8145e = appLovinAdRewardListener;
        }

        private void a(e eVar) {
            int i10;
            String str;
            String d10 = a.this.d();
            if (!StringUtils.isValidString(d10) || !a.this.f8133h) {
                if (v.a()) {
                    v A = a.this.f8126a.A();
                    A.e("IncentivizedAdController", "Invalid reward state - result: " + d10 + " and wasFullyEngaged: " + a.this.f8133h);
                    a.this.f8126a.A().b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                eVar.aF();
                if (a.this.f8133h) {
                    if (v.a()) {
                        a.this.f8126a.A().e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    if (v.a()) {
                        a.this.f8126a.A().e("IncentivizedAdController", "User close the ad prematurely");
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                eVar.a(c.a(str));
                if (v.a()) {
                    a.this.f8126a.A().b("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                j.a(this.f8145e, eVar, i10);
            }
            a.this.a(eVar);
            if (v.a()) {
                a.this.f8126a.A().b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            j.b(this.f8142b, eVar);
            if (eVar.ag().getAndSet(true)) {
                return;
            }
            if (v.a()) {
                a.this.f8126a.A().b("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            a.this.f8126a.S().a(new com.applovin.impl.sdk.e.v(eVar, a.this.f8126a), o.a.REWARD);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            j.a(this.f8143c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            j.a(this.f8142b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof f) {
                appLovinAd = ((f) appLovinAd).a();
            }
            if (appLovinAd instanceof e) {
                a((e) appLovinAd);
            } else if (v.a()) {
                v A = a.this.f8126a.A();
                A.e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
            }
        }

        @Override // com.applovin.impl.sdk.ad.g
        public void onAdDisplayFailed(String str) {
            j.a(this.f8142b, str);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("quota_exceeded");
            j.b(this.f8145e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("rejected");
            j.c(this.f8145e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("accepted");
            j.a(this.f8145e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            a.this.a("network_timeout");
            j.a(this.f8145e, appLovinAd, i10);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            j.a(this.f8144d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            j.a(this.f8144d, appLovinAd, d10, z10);
            a.this.f8133h = z10;
        }
    }

    public a(String str, AppLovinSdk appLovinSdk) {
        this.f8126a = appLovinSdk.coreSdk;
        this.f8127b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f8129d = str;
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            if (v.a()) {
                v A = this.f8126a.A();
                A.e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
            }
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f8126a);
        if (maybeRetrieveNonDummyAd == null) {
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f8126a.Y(), context);
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        create.setAdDisplayListener(bVar);
        create.setAdVideoPlaybackListener(bVar);
        create.setAdClickListener(bVar);
        create.showAndRender(maybeRetrieveNonDummyAd);
        if (maybeRetrieveNonDummyAd instanceof e) {
            a((e) maybeRetrieveNonDummyAd, bVar);
        }
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            if (v.a()) {
                v A = this.f8126a.A();
                A.e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
            }
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f8126a);
        if (maybeRetrieveNonDummyAd == null) {
            a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f8126a.Y(), context);
        b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        create.setAdDisplayListener(bVar);
        create.setAdVideoPlaybackListener(bVar);
        create.setAdClickListener(bVar);
        create.showAndRender(maybeRetrieveNonDummyAd, viewGroup, iVar);
        if (maybeRetrieveNonDummyAd instanceof e) {
            a((e) maybeRetrieveNonDummyAd, bVar);
        }
    }

    private void a(e eVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f8126a.S().a(new aa(eVar, appLovinAdRewardListener, this.f8126a), o.a.REWARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f8128c;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof f) {
                if (appLovinAd != ((f) appLovinAd2).a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.f8128c = null;
        }
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f8128c;
        }
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        if (v.a()) {
            v.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        }
        c();
    }

    private void a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f8126a.T().a(com.applovin.impl.sdk.d.f.f8327j);
        j.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        j.b(appLovinAdDisplayListener, appLovinAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f8131f) {
            this.f8132g = str;
        }
    }

    private void b(AppLovinAd appLovinAd, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl = appLovinAd != null ? (AppLovinAdImpl) appLovinAd : (AppLovinAdImpl) this.f8128c;
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, iVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        if (v.a()) {
            v.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        }
        c();
    }

    private void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8127b.loadNextIncentivizedAd(this.f8129d, appLovinAdLoadListener);
    }

    private void c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f8130e;
        if (softReference == null || (appLovinAdLoadListener = softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        String str;
        synchronized (this.f8131f) {
            str = this.f8132g;
        }
        return str;
    }

    private AppLovinAdRewardListener e() {
        return new AppLovinAdRewardListener() { // from class: com.applovin.impl.sdk.b.a.1
            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                if (v.a()) {
                    v A = a.this.f8126a.A();
                    A.e("IncentivizedAdController", "User over quota: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                if (v.a()) {
                    v A = a.this.f8126a.A();
                    A.e("IncentivizedAdController", "Reward rejected: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                if (v.a()) {
                    v A = a.this.f8126a.A();
                    A.b("IncentivizedAdController", "Reward validated: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
                if (v.a()) {
                    v A = a.this.f8126a.A();
                    A.e("IncentivizedAdController", "Reward validation failed: " + i10);
                }
            }
        };
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = e();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAd appLovinAd, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        b(appLovinAd, viewGroup, iVar, context, appLovinAdRewardListener == null ? e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        if (v.a()) {
            this.f8126a.A().b("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f8130e = new SoftReference<>(appLovinAdLoadListener);
        if (!a()) {
            b(new C0129a(appLovinAdLoadListener));
            return;
        }
        if (v.a()) {
            v.i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f8128c);
        }
    }

    public boolean a() {
        return this.f8128c != null;
    }

    public String b() {
        return this.f8129d;
    }
}
