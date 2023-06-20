package com.bytedance.sdk.openadsdk;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;

/* loaded from: classes.dex */
public interface TTFullScreenVideoAd extends TTClientBidding {

    /* loaded from: classes.dex */
    public interface FullScreenVideoAdInteractionListener {
        void onAdClose();

        void onAdShow();

        void onAdVideoBarClick();

        void onSkippedVideo();

        void onVideoComplete();
    }

    String getAdCreativeToken();

    int getFullVideoAdType();

    int getInteractionType();

    Map<String, Object> getMediaExtraInfo();

    void setFullScreenVideoAdInteractionListener(FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener);

    void setShowDownLoadBar(boolean z10);

    void showFullScreenVideoAd(Activity activity);

    void showFullScreenVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str);
}
