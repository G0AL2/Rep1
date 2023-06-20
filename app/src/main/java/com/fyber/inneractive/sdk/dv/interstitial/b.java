package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* loaded from: classes.dex */
public class b extends com.fyber.inneractive.sdk.a<InterstitialAd> {

    /* renamed from: k  reason: collision with root package name */
    public final InterstitialAdLoadCallback f17104k;

    /* renamed from: l  reason: collision with root package name */
    public final FullScreenContentCallback f17105l;

    /* loaded from: classes.dex */
    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            com.fyber.inneractive.sdk.dv.d dVar = b.this.f17081g;
            if (dVar != null) {
                ((com.fyber.inneractive.sdk.dv.b) dVar).f();
                InneractiveAdRequest inneractiveAdRequest = b.this.f17239a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
                b bVar = b.this;
                com.fyber.inneractive.sdk.dv.handler.c.a(spotId, aVar, bVar.f17239a, (f) bVar.f17240b, loadAdError.getMessage());
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, com.google.android.gms.ads.interstitial.InterstitialAd] */
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            InterstitialAd interstitialAd2 = interstitialAd;
            b bVar = b.this;
            if (bVar.f17081g != null) {
                bVar.f17083i = interstitialAd2;
                bVar.f();
                ((com.fyber.inneractive.sdk.dv.b) b.this.f17081g).d();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.interstitial.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0230b extends FullScreenContentCallback {
        public C0230b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = b.this.f16669j;
            if (aVar != null) {
                aVar.i();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = b.this.f16669j;
            if (aVar != null) {
                aVar.v();
            }
        }
    }

    public b(z zVar, s sVar, f fVar) {
        super(zVar, sVar, fVar);
        this.f17104k = new a();
        this.f17105l = new C0230b();
    }

    @Override // com.fyber.inneractive.sdk.dv.a
    public void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.d dVar) {
        this.f17081g = dVar;
        InterstitialAd.load(l.f20301a, "FyberInterstitial", adRequest, this.f17104k);
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
            ((InterstitialAd) t10).setFullScreenContentCallback(this.f17105l);
            ((InterstitialAd) this.f17083i).show(activity);
        }
    }
}
