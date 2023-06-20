package com.chartboost.sdk.Privacy.model;

import com.chartboost.sdk.Tracking.a;
import com.chartboost.sdk.impl.m1;
import org.json.JSONException;
import org.json.JSONObject;
import qe.k;

/* loaded from: classes.dex */
public abstract class GenericDataUseConsent implements DataUseConsent {

    /* renamed from: a  reason: collision with root package name */
    private String f13761a = "";

    /* renamed from: b  reason: collision with root package name */
    private Object f13762b = "";

    @Override // com.chartboost.sdk.Privacy.model.DataUseConsent
    public Object getConsent() {
        return this.f13762b;
    }

    @Override // com.chartboost.sdk.Privacy.model.DataUseConsent
    public String getPrivacyStandard() {
        return this.f13761a;
    }

    public final void handleException(String str) {
        try {
            m1.d(new a("consent_creation_error", str, "", ""));
            throw new Exception(str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.chartboost.sdk.Privacy.model.DataUseConsent
    public boolean isValidConsent(String str) {
        k.f(str, "consent");
        return true;
    }

    @Override // com.chartboost.sdk.Privacy.model.DataUseConsent
    public void setConsent(Object obj) {
        k.f(obj, "<set-?>");
        this.f13762b = obj;
    }

    @Override // com.chartboost.sdk.Privacy.model.DataUseConsent
    public void setPrivacyStandard(String str) {
        k.f(str, "<set-?>");
        this.f13761a = str;
    }

    @Override // com.chartboost.sdk.Privacy.model.DataUseConsent
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", getPrivacyStandard());
            jSONObject.put("consent", getConsent());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
