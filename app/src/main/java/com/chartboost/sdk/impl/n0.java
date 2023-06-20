package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n0 {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final String f14219a;

        /* renamed from: b  reason: collision with root package name */
        final Object f14220b;

        public a(String str, Object obj) {
            this.f14219a = str;
            this.f14220b = obj;
        }
    }

    public static JSONObject a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (jSONObject == null) {
                break;
            }
            jSONObject = jSONObject.optJSONObject(str);
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            CBLogging.b("CBJSON", "put (" + str + ")" + e10.toString());
        }
    }

    public static JSONObject a(a... aVarArr) {
        JSONObject jSONObject = new JSONObject();
        for (a aVar : aVarArr) {
            a(jSONObject, aVar.f14219a, aVar.f14220b);
        }
        return jSONObject;
    }

    public static a a(String str, Object obj) {
        return new a(str, obj);
    }
}
