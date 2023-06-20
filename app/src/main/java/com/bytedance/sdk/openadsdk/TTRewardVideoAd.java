package com.bytedance.sdk.openadsdk;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;

/* loaded from: classes.dex */
public interface TTRewardVideoAd extends TTClientBidding {

    /* loaded from: classes.dex */
    public interface RewardAdInteractionListener {
        void onAdClose();

        void onAdShow();

        void onAdVideoBarClick();

        void onRewardVerify(boolean z10, int i10, String str, int i11, String str2);

        void onSkippedVideo();

        void onVideoComplete();

        void onVideoError();
    }

    String getAdCreativeToken();

    int getInteractionType();

    Map<String, Object> getMediaExtraInfo();

    int getRewardVideoAdType();

    void setRewardAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener);

    void setShowDownLoadBar(boolean z10);

    void showRewardVideoAd(Activity activity);

    void showRewardVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str);
}
