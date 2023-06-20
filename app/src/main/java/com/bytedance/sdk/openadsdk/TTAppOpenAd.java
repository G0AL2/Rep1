package com.bytedance.sdk.openadsdk;

import android.app.Activity;

/* loaded from: classes.dex */
public interface TTAppOpenAd {

    /* loaded from: classes.dex */
    public interface AppOpenAdInteractionListener {
        void onAdClicked();

        void onAdCountdownToZero();

        void onAdShow();

        void onAdSkip();
    }

    void setOpenAdInteractionListener(AppOpenAdInteractionListener appOpenAdInteractionListener);

    void showAppOpenAd(Activity activity);
}
