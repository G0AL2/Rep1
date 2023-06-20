package com.ironsource.sdk.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f27657a = "d";

    /* renamed from: c  reason: collision with root package name */
    private static d f27658c;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, e> f27659b = Collections.synchronizedMap(new HashMap());

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f27658c == null) {
                f27658c = new d();
            }
            dVar = f27658c;
        }
        return dVar;
    }

    public static String a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public static boolean b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static com.ironsource.sdk.a d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new com.ironsource.sdk.a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception unused) {
            return new com.ironsource.sdk.a();
        }
    }

    public final e a(String str) {
        if (str.isEmpty() || !this.f27659b.containsKey(str)) {
            return null;
        }
        return this.f27659b.get(str);
    }

    public com.ironsource.sdk.a c(JSONObject jSONObject) {
        com.ironsource.sdk.a aVar = new com.ironsource.sdk.a();
        try {
            return d(jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
            return aVar;
        }
    }
}
