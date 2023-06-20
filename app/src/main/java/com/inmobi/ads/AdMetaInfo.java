package com.inmobi.ads;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AdMetaInfo {

    /* renamed from: a  reason: collision with root package name */
    private String f24360a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f24361b;

    public AdMetaInfo(String str, JSONObject jSONObject) {
        this.f24360a = str;
        this.f24361b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f24361b;
        if (jSONObject == null) {
            return 0.0d;
        }
        return jSONObject.optDouble("buyerPrice");
    }

    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f24361b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final String getBidKeyword() {
        JSONObject jSONObject = this.f24361b;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("bidKeyword");
    }

    public final String getCreativeID() {
        return this.f24360a;
    }
}
