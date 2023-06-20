package xd;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.scar.adapter.common.g;

/* compiled from: ScarInterstitialAdListener.java */
/* loaded from: classes3.dex */
public class d extends xd.b {

    /* renamed from: b  reason: collision with root package name */
    private final c f38891b;

    /* renamed from: c  reason: collision with root package name */
    private final g f38892c;

    /* renamed from: d  reason: collision with root package name */
    private final InterstitialAdLoadCallback f38893d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final FullScreenContentCallback f38894e = new b();

    /* compiled from: ScarInterstitialAdListener.java */
    /* loaded from: classes3.dex */
    class a extends InterstitialAdLoadCallback {
        a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f38892c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            super.onAdLoaded((a) interstitialAd);
            d.this.f38892c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(d.this.f38894e);
            d.this.f38891b.d(interstitialAd);
            od.b bVar = d.this.f38890a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    /* compiled from: ScarInterstitialAdListener.java */
    /* loaded from: classes3.dex */
    class b extends FullScreenContentCallback {
        b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            d.this.f38892c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            d.this.f38892c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f38892c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            d.this.f38892c.onAdOpened();
        }
    }

    public d(g gVar, c cVar) {
        this.f38892c = gVar;
        this.f38891b = cVar;
    }

    public InterstitialAdLoadCallback e() {
        return this.f38893d;
    }
}
