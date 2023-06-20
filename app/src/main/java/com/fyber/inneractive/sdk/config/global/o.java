package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f16976a;

    public o(JSONObject jSONObject) {
        this.f16976a = jSONObject;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Double a(String str) {
        return Double.valueOf(this.f16976a.optDouble(str, 0.0d));
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Integer b(String str) {
        if (this.f16976a.has(str)) {
            try {
                return Integer.valueOf(this.f16976a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String c(String str) {
        if (this.f16976a.has(str)) {
            try {
                return this.f16976a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Boolean d(String str) {
        if (this.f16976a.has(str)) {
            try {
                return Boolean.valueOf(this.f16976a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String toString() {
        JSONObject jSONObject = this.f16976a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        return this.f16976a.optString(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.f16976a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.f16976a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
