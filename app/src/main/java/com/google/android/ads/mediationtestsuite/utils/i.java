package com.google.android.ads.mediationtestsuite.utils;

import android.app.Activity;
import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import org.jspecify.nullness.Nullable;

/* compiled from: RewardedAdManager.java */
/* loaded from: classes2.dex */
public class i extends com.google.android.ads.mediationtestsuite.utils.a {

    /* renamed from: f  reason: collision with root package name */
    private RewardedAd f20934f;

    /* compiled from: RewardedAdManager.java */
    /* loaded from: classes2.dex */
    class a extends RewardedAdLoadCallback {
        a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            i.this.f20905d.onAdFailedToLoad(loadAdError);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd rewardedAd) {
            i.this.f20934f = rewardedAd;
            i.this.f20905d.onAdLoaded();
        }
    }

    /* compiled from: RewardedAdManager.java */
    /* loaded from: classes2.dex */
    class b implements OnUserEarnedRewardListener {
        b(i iVar) {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
        }
    }

    public i(NetworkConfig networkConfig, com.google.android.ads.mediationtestsuite.a aVar) {
        super(networkConfig, aVar);
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    @Nullable
    protected String c() {
        RewardedAd rewardedAd = this.f20934f;
        if (rewardedAd == null) {
            return null;
        }
        return rewardedAd.getResponseInfo().getMediationAdapterClassName();
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    public void e(Context context) {
        this.f20934f = null;
        RewardedAd.load(context, this.f20902a.h(), this.f20904c, new a());
    }

    @Override // com.google.android.ads.mediationtestsuite.utils.a
    public void f(Activity activity) {
        RewardedAd rewardedAd = this.f20934f;
        if (rewardedAd != null) {
            rewardedAd.show(activity, new b(this));
        }
    }
}
