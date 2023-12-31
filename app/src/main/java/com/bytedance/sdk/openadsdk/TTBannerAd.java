package com.bytedance.sdk.openadsdk;

import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public interface TTBannerAd {

    /* loaded from: classes.dex */
    public interface AdInteractionListener {
        void onAdClicked(View view, int i10);

        void onAdShow(View view, int i10);
    }

    View getBannerView();

    TTAdDislike getDislikeDialog(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback);

    int getInteractionType();

    Map<String, Object> getMediaExtraInfo();

    void setBannerInteractionListener(AdInteractionListener adInteractionListener);

    void setShowDislikeIcon(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback);

    void setSlideIntervalTime(int i10);
}
