package com.fyber.inneractive.sdk.dv.banner;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.dv.d;
import com.fyber.inneractive.sdk.dv.f;
import com.fyber.inneractive.sdk.dv.handler.c;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes.dex */
public class a extends com.fyber.inneractive.sdk.dv.a<AdView> {

    /* renamed from: j  reason: collision with root package name */
    public boolean f17086j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17087k;

    /* renamed from: l  reason: collision with root package name */
    public final AdListener f17088l;

    /* renamed from: com.fyber.inneractive.sdk.dv.banner.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0228a extends AdListener {
        public C0228a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            InneractiveAdRequest inneractiveAdRequest = a.this.f17239a;
            String spotId = inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : null;
            com.fyber.inneractive.sdk.dv.enums.a aVar = com.fyber.inneractive.sdk.dv.enums.a.Load;
            a aVar2 = a.this;
            c.a(spotId, aVar, aVar2.f17239a, (f) aVar2.f17240b, loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            a aVar = a.this;
            b bVar = aVar.f17082h;
            if (bVar == null) {
                aVar.f17086j = true;
            } else {
                bVar.v();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            a aVar = a.this;
            if (aVar.f17081g != null) {
                aVar.f17087k = true;
                ((com.fyber.inneractive.sdk.dv.b) a.this.f17081g).d();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            f fVar;
            r rVar;
            com.fyber.inneractive.sdk.cache.session.enums.b bVar;
            b bVar2 = a.this.f17082h;
            if (bVar2 != null) {
                bVar2.z();
                AdContent adcontent = bVar2.f17247b;
                if (adcontent == 0 || (fVar = (f) ((a) adcontent).f17240b) == null) {
                    return;
                }
                bVar2.a(fVar);
                z zVar = ((a) bVar2.f17247b).f17242d;
                if (zVar == null || (rVar = ((y) zVar).f17074c) == null) {
                    return;
                }
                com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
                if (rVar.f17018b == UnitDisplayType.MRECT) {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16854e;
                } else {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16856g;
                }
                bVar2.a(aVar, bVar);
            }
        }
    }

    public a(z zVar, s sVar, f fVar) {
        super(zVar, sVar, fVar);
        this.f17086j = false;
        this.f17087k = false;
        this.f17088l = new C0228a();
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean d() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.dv.a, com.fyber.inneractive.sdk.flow.j
    public boolean e() {
        return this.f17087k;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.google.android.gms.ads.BaseAdView, com.google.android.gms.ads.AdView] */
    @Override // com.fyber.inneractive.sdk.dv.a
    public void a(AdRequest adRequest, d dVar) {
        r rVar;
        this.f17081g = dVar;
        ?? adView = new AdView(l.f20301a);
        this.f17083i = adView;
        AdSize adSize = AdSize.BANNER;
        z zVar = this.f17242d;
        if (zVar != null && (rVar = ((y) zVar).f17074c) != null && rVar.f17018b == UnitDisplayType.MRECT) {
            adSize = AdSize.MEDIUM_RECTANGLE;
        }
        adView.setAdSize(adSize);
        ((AdView) this.f17083i).setAdUnitId("FyberBanner");
        ((AdView) this.f17083i).setAdListener(this.f17088l);
        ((AdView) this.f17083i).loadAd(adRequest);
    }
}
