package com.ironsource.sdk.controller;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    String f27821a;

    /* renamed from: b  reason: collision with root package name */
    JSONObject f27822b;

    /* renamed from: c  reason: collision with root package name */
    String f27823c;

    /* renamed from: d  reason: collision with root package name */
    String f27824d;

    public n(JSONObject jSONObject) {
        this.f27821a = jSONObject.optString("functionName");
        this.f27822b = jSONObject.optJSONObject("functionParams");
        this.f27823c = jSONObject.optString("success");
        this.f27824d = jSONObject.optString("fail");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", this.f27821a);
            jSONObject.put("functionParams", this.f27822b);
            jSONObject.put("success", this.f27823c);
            jSONObject.put("fail", this.f27824d);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
