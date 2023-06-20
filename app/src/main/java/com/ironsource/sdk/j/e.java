package com.ironsource.sdk.j;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface e {
    void onGetOWCreditsFailed(String str);

    void onOWAdClosed();

    boolean onOWAdCredited(int i10, int i11, boolean z10);

    void onOWShowFail(String str);

    void onOWShowSuccess(String str);

    void onOfferwallEventNotificationReceived(String str, JSONObject jSONObject);

    void onOfferwallInitFail(String str);

    void onOfferwallInitSuccess();
}
