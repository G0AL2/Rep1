package com.chartboost.sdk.impl;

import com.chartboost.sdk.Privacy.model.DataUseConsent;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t1 {
    public JSONObject a(List<DataUseConsent> list) {
        JSONObject jSONObject = new JSONObject();
        for (DataUseConsent dataUseConsent : list) {
            try {
                jSONObject.put(dataUseConsent.getPrivacyStandard(), dataUseConsent.getConsent());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }
}
