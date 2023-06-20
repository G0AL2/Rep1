package com.ironsource.sdk.j;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface c extends a {
    void onInterstitialAdRewarded(String str, int i10);

    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject);

    void onInterstitialInitFailed(String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(String str);

    void onInterstitialLoadSuccess();

    void onInterstitialOpen();

    void onInterstitialShowFailed(String str);

    void onInterstitialShowSuccess();
}
