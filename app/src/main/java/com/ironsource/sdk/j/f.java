package com.ironsource.sdk.j;

import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public interface f extends a {
    void onRVAdClicked();

    void onRVAdClosed();

    void onRVAdCredited(int i10);

    void onRVAdOpened();

    void onRVEventNotificationReceived(String str, JSONObject jSONObject);

    void onRVInitFail(String str);

    void onRVInitSuccess(com.ironsource.sdk.g.a aVar);

    void onRVNoMoreOffers();

    void onRVShowFail(String str);
}
