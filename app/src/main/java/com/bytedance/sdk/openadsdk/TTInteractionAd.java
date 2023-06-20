package com.bytedance.sdk.openadsdk;

import android.app.Activity;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public interface TTInteractionAd extends TTClientBidding {

    /* loaded from: classes.dex */
    public interface AdInteractionListener {
        void onAdClicked();

        void onAdDismiss();

        void onAdShow();
    }

    int getInteractionType();

    Map<String, Object> getMediaExtraInfo();

    void setAdInteractionListener(AdInteractionListener adInteractionListener);

    void showInteractionAd(Activity activity);
}
