package com.vehiclecloud.app.videofetch.rnads.admob;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.vehiclecloud.app.videofetch.rnads.api.ContextHelper;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsReward;

/* loaded from: classes3.dex */
public class RNAdsAdmobReward implements RNAdsReward<RewardedAd> {
    public static /* synthetic */ void a(RNAdsReward.Listener listener, RewardItem rewardItem) {
        listener.onUserEarnedReward();
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsReward
    public void load(ReactApplicationContext reactApplicationContext, String str, final RNAdsReward.Listener listener) {
        RewardedAd.load(ContextHelper.getActivity(reactApplicationContext), str, new AdRequest.Builder().build(), new RewardedAdLoadCallback() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobReward.1
            {
                RNAdsAdmobReward.this = this;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                listener.onAdFailedToLoad(String.valueOf(loadAdError.getCode()));
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedAd rewardedAd) {
                listener.onAdLoaded(rewardedAd);
            }
        });
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsReward
    public /* synthetic */ void showByObject(Activity activity, RNAdsReward.Listener listener, Object obj) {
        zd.f.a(this, activity, listener, obj);
    }

    @Override // com.vehiclecloud.app.videofetch.rnads.api.RNAdsReward
    public void show(Activity activity, final RNAdsReward.Listener listener, RewardedAd rewardedAd) {
        rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.RNAdsAdmobReward.2
            {
                RNAdsAdmobReward.this = this;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                listener.onAdClicked();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                listener.onAdDismissed();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                listener.onAdFailedToShow(String.valueOf(adError.getCode()));
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                listener.onAdShowed();
            }
        });
        OnPaidEventListener onPaidEventListener = RNAdsAdmobIlrd.onPaidEventListener;
        if (onPaidEventListener != null) {
            rewardedAd.setOnPaidEventListener(onPaidEventListener);
        }
        rewardedAd.show(activity, new OnUserEarnedRewardListener() { // from class: com.vehiclecloud.app.videofetch.rnads.admob.d
            @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
            public final void onUserEarnedReward(RewardItem rewardItem) {
                RNAdsAdmobReward.a(RNAdsReward.Listener.this, rewardItem);
            }
        });
    }
}
