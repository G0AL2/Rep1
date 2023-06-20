package com.bytedance.sdk.component.adexpress.dynamic.c;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicParserUtils.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final JSONObject f9671a = c.a().b();

    public static void a(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject jSONObject2 = f9671a;
        if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject(str)) == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("values");
        if (optJSONObject2 == null) {
            return;
        }
        a(optJSONObject2, jSONObject);
    }

    public static JSONObject a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject optJSONObject;
        JSONObject jSONObject3 = f9671a;
        if (jSONObject3 == null || (optJSONObject = jSONObject3.optJSONObject(str)) == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return a(jSONObject2, optJSONObject.optJSONObject("themeValues"), jSONObject);
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static JSONObject a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String a(String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject jSONObject = f9671a;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(str)) == null || (optJSONObject2 = optJSONObject.optJSONObject("values")) == null) {
            return null;
        }
        return optJSONObject2.optString("data");
    }

    public static JSONObject a(JSONArray jSONArray) {
        JSONObject optJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (optJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("values");
    }
}
