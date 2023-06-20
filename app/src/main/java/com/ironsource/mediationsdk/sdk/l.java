package com.ironsource.mediationsdk.sdk;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface l {
    void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);

    boolean isRewardedVideoAvailable(JSONObject jSONObject);

    void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);
}
