package xd;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.h;

/* compiled from: ScarRewardedAdListener.java */
/* loaded from: classes3.dex */
public class f extends xd.b {

    /* renamed from: b  reason: collision with root package name */
    private final e f38897b;

    /* renamed from: c  reason: collision with root package name */
    private final h f38898c;

    /* renamed from: d  reason: collision with root package name */
    private final RewardedAdLoadCallback f38899d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final OnUserEarnedRewardListener f38900e = new b();

    /* renamed from: f  reason: collision with root package name */
    private final FullScreenContentCallback f38901f = new c();

    /* compiled from: ScarRewardedAdListener.java */
    /* loaded from: classes3.dex */
    class a extends RewardedAdLoadCallback {
        a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            f.this.f38898c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            super.onAdLoaded((a) rewardedAd);
            f.this.f38898c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(f.this.f38901f);
            f.this.f38897b.d(rewardedAd);
            od.b bVar = f.this.f38890a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    /* compiled from: ScarRewardedAdListener.java */
    /* loaded from: classes3.dex */
    class b implements OnUserEarnedRewardListener {
        b() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
            f.this.f38898c.onUserEarnedReward();
        }
    }

    /* compiled from: ScarRewardedAdListener.java */
    /* loaded from: classes3.dex */
    class c extends FullScreenContentCallback {
        c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.f38898c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            f.this.f38898c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.f38898c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.f38898c.onAdOpened();
        }
    }

    public f(h hVar, e eVar) {
        this.f38898c = hVar;
        this.f38897b = eVar;
    }

    public RewardedAdLoadCallback e() {
        return this.f38899d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f38900e;
    }
}
