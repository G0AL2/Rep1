package com.unity3d.scar.adapter.v1950.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.scar.adapter.common.g;

/* compiled from: ScarInterstitialAdListener.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private g f28529a;

    /* renamed from: b  reason: collision with root package name */
    private od.b f28530b;

    /* renamed from: c  reason: collision with root package name */
    private AdListener f28531c = new a();

    /* compiled from: ScarInterstitialAdListener.java */
    /* loaded from: classes3.dex */
    class a extends AdListener {
        a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            b.this.f28529a.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            b.this.f28529a.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            b.this.f28529a.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            b.this.f28529a.onAdLoaded();
            if (b.this.f28530b != null) {
                b.this.f28530b.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            b.this.f28529a.onAdOpened();
        }
    }

    public b(InterstitialAd interstitialAd, g gVar) {
        this.f28529a = gVar;
    }

    public AdListener c() {
        return this.f28531c;
    }

    public void d(od.b bVar) {
        this.f28530b = bVar;
    }
}
