package com.fyber.inneractive.sdk.dv.interstitial;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/* loaded from: classes.dex */
public class c extends com.fyber.inneractive.sdk.a<InterstitialAd> {

    /* renamed from: k  reason: collision with root package name */
    public final AdListener f17108k;

    /* renamed from: l  reason: collision with root package name */
    public final AdListener f17109l;

    /* loaded from: classes.dex */
    public class a extends AdListener {
        public a() {
        }

        public void onAdFailedToLoad(int i10) {
            com.fyber.inneractive.sdk.dv.d dVar = c.this.f17081g;
            if (dVar != null) {
                ((com.fyber.inneractive.sdk.dv.b) dVar).f();
                InneractiveAdRequest inneractiveAdRequest = c.this.f17239a;
                String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
                com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
                c cVar = c.this;
                com.fyber.inneractive.sdk.dv.handler.c.a(spotId, aVar, cVar.f17239a, (f) cVar.f17240b, String.format("errorCode - %d", Integer.valueOf(i10)));
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            c cVar = c.this;
            if (cVar.f17081g != null) {
                cVar.f();
                ((com.fyber.inneractive.sdk.dv.b) c.this.f17081g).d();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends AdListener {
        public b() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = c.this.f16669j;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = c.this.f16669j;
            if (aVar != null) {
                aVar.i();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = c.this.f16669j;
            if (aVar != null) {
                aVar.v();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            com.fyber.inneractive.sdk.dv.interstitial.a aVar = c.this.f16669j;
            if (aVar != null) {
                aVar.v();
            }
        }
    }

    public c(z zVar, s sVar, f fVar) {
        super(zVar, sVar, fVar);
        this.f17108k = new a();
        this.f17109l = new b();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.google.android.gms.ads.InterstitialAd] */
    @Override // com.fyber.inneractive.sdk.dv.a
    public void a(AdRequest adRequest, com.fyber.inneractive.sdk.dv.d dVar) {
        this.f17081g = dVar;
        ?? interstitialAd = new InterstitialAd(l.f20301a);
        this.f17083i = interstitialAd;
        interstitialAd.setAdListener(this.f17108k);
        ((InterstitialAd) this.f17083i).setAdUnitId("FyberInterstitial");
        ((InterstitialAd) this.f17083i).loadAd(adRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.flow.j
    public boolean e() {
        T t10 = this.f17083i;
        return t10 != 0 && ((InterstitialAd) t10).isLoaded();
    }

    @Override // com.fyber.inneractive.sdk.a
    public void a(com.fyber.inneractive.sdk.dv.interstitial.a aVar, Activity activity) {
        this.f16669j = aVar;
        T t10 = this.f17083i;
        if (t10 != 0) {
            ((InterstitialAd) t10).setAdListener(this.f17109l);
            ((InterstitialAd) this.f17083i).show();
        }
    }
}
