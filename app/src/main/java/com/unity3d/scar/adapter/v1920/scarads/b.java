package com.unity3d.scar.adapter.v1920.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.g;

/* compiled from: ScarInterstitialAdListener.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private g f28519a;

    /* renamed from: b  reason: collision with root package name */
    private od.b f28520b;

    /* renamed from: c  reason: collision with root package name */
    private AdListener f28521c = new a();

    /* compiled from: ScarInterstitialAdListener.java */
    /* loaded from: classes3.dex */
    class a extends AdListener {
        a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            b.this.f28519a.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            b.this.f28519a.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            b.this.f28519a.onAdLoaded();
            if (b.this.f28520b != null) {
                b.this.f28520b.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            b.this.f28519a.onAdOpened();
        }
    }

    public b(InterstitialAd interstitialAd, g gVar) {
        this.f28519a = gVar;
    }

    public AdListener c() {
        return this.f28521c;
    }

    public void d(od.b bVar) {
        this.f28520b = bVar;
    }
}
