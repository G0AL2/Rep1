package com.ironsource.environment.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {
    static {
        new b();
    }

    public static HashMap<String, Object> a(ConcurrentHashMap<String, Object> concurrentHashMap) {
        Object d10;
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                d10 = d((JSONObject) entry.getValue());
            } else if (entry.getValue() instanceof JSONArray) {
                d10 = c((JSONArray) entry.getValue());
            } else if (entry.getValue() instanceof Map) {
                d10 = b((Map) entry.getValue());
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap.put(entry.getKey(), d10);
        }
        return hashMap;
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) opt));
                }
            }
        }
        return jSONObject;
    }

    private static Map<String, Object> b(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, map.get(str));
        }
        return hashMap;
    }

    private static JSONArray c(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jSONArray2.put(jSONArray.opt(i10));
        }
        return jSONArray2;
    }

    private static JSONObject d(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }
}
