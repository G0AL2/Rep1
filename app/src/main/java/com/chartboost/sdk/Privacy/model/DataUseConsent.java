package com.chartboost.sdk.Privacy.model;

import org.json.JSONObject;

/* loaded from: classes.dex */
public interface DataUseConsent {
    Object getConsent();

    String getPrivacyStandard();

    boolean isValidConsent(String str);

    void setConsent(Object obj);

    void setPrivacyStandard(String str);

    JSONObject toJson();
}
