package com.fyber.inneractive.sdk.dv.rewarded;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.dv.d;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* loaded from: classes.dex */
public class b extends com.fyber.inneractive.sdk.a<RewardedAd> {

    /* renamed from: k  reason: collision with root package name */
    public final RewardedAdLoadCallback f17119k;

    /* renamed from: l  reason: collision with root package name */
    public final RewardedAdCallback f17120l;

    /* loaded from: classes.dex */
    public class a extends RewardedAdLoadCallback {
        public a() {
        }

        public void onRewardedAdFailedToLoad(int i10) {
            d dVar = b.this.f17081g;
            if (dVar != null) {
                ((com.fyber.inneractive.sdk.dv.b) dVar).f();
                InneractiveAdRequest inneractiveAdRequest = b.this.f17239a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
                b bVar = b.this;
                com.fyber.inneractive.sdk.dv.handler.c.a(spotId, aVar, bVar.f17239a, (f) bVar.f17240b, String.format("errorCode - %d", Integer.valueOf(i10)));
            }
        }

        public void onRewardedAdLoaded() {
            b bVar = b.this;
            if (bVar.f17081g != null) {
                bVar.f();
                ((com.fyber.inneractive.sdk.dv.b) b.this.f17081g).d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.rewarded.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0232b extends RewardedAdCallback {
        public C0232b() {
        }

        public void onRewardedAdClosed() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = b.this.f16669j;
            if (aVar != null) {
                aVar.i();
            }
        }

        public void onRewardedAdFailedToShow(int i10) {
        }

        public void onRewardedAdOpened() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = b.this.f16669j;
            if (aVar != null) {
                aVar.v();
            }
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = b.this.f16669j;
            if (aVar != null) {
                aVar.onReward();
            }
        }
    }

    public b(z zVar, s sVar, f fVar) {
        super(zVar, sVar, fVar);
        this.f17119k = new a();
        this.f17120l = new C0232b();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.ads.rewarded.RewardedAd, T] */
    @Override // com.fyber.inneractive.sdk.dv.a
    public void a(AdRequest adRequest, d dVar) {
        this.f17081g = dVar;
        ?? rewardedAd = new RewardedAd(l.f20301a, "FyberRewarded");
        this.f17083i = rewardedAd;
        rewardedAd.loadAd(adRequest, this.f17119k);
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.flow.j
    public boolean e() {
        T t10 = this.f17083i;
        if (t10 != 0) {
            return ((RewardedAd) t10).isLoaded();
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.a
    public void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f16669j = aVar;
        ((RewardedAd) this.f17083i).show(activity, this.f17120l);
    }
}
