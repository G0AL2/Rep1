package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.dv.d;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* loaded from: classes.dex */
public class a extends com.fyber.inneractive.sdk.a<RewardedAd> {

    /* renamed from: k  reason: collision with root package name */
    public final RewardedAdLoadCallback f17113k;

    /* renamed from: l  reason: collision with root package name */
    public final FullScreenContentCallback f17114l;

    /* renamed from: m  reason: collision with root package name */
    public final OnUserEarnedRewardListener f17115m;

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0231a extends RewardedAdLoadCallback {
        public C0231a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            d dVar = a.this.f17081g;
            if (dVar != null) {
                ((com.fyber.inneractive.sdk.dv.b) dVar).f();
                InneractiveAdRequest inneractiveAdRequest = a.this.f17239a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
                a aVar2 = a.this;
                com.fyber.inneractive.sdk.dv.handler.c.a(spotId, aVar, aVar2.f17239a, (f) aVar2.f17240b, loadAdError.getMessage());
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.ads.rewarded.RewardedAd, T] */
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            RewardedAd rewardedAd2 = rewardedAd;
            a aVar = a.this;
            if (aVar.f17081g != null) {
                aVar.f17083i = rewardedAd2;
                aVar.f();
                ((com.fyber.inneractive.sdk.dv.b) a.this.f17081g).d();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = a.this.f16669j;
            if (aVar != null) {
                aVar.i();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = a.this.f16669j;
            if (aVar != null) {
                aVar.v();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements OnUserEarnedRewardListener {
        public c() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = a.this.f16669j;
            if (aVar != null) {
                aVar.onReward();
            }
        }
    }

    public a(z zVar, s sVar, f fVar) {
        super(zVar, sVar, fVar);
        this.f17113k = new C0231a();
        this.f17114l = new b();
        this.f17115m = new c();
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public void a(AdRequest adRequest, d dVar) {
        this.f17081g = dVar;
        RewardedAd.load(l.f20301a, "FyberRewarded", adRequest, this.f17113k);
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.flow.j
    public boolean e() {
        return this.f17083i != 0;
    }

    @Override // com.fyber.inneractive.sdk.a
    public void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f16669j = aVar;
        T t10 = this.f17083i;
        if (t10 != 0) {
            ((RewardedAd) t10).setFullScreenContentCallback(this.f17114l);
            ((RewardedAd) this.f17083i).show(activity, this.f17115m);
        }
    }
}
