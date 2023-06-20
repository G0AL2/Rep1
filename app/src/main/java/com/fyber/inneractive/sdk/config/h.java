package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f16984a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, g> f16985b = new HashMap();

    public static h a(JSONObject jSONObject) {
        h hVar = new h();
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("overrides");
        JSONArray names = optJSONObject.names();
        for (int i10 = 0; i10 < names.length(); i10++) {
            String optString = names.optString(i10, null);
            String optString2 = optJSONObject.optString(optString, null);
            if (optString != null && optString2 != null) {
                hVar.f16984a.put(optString, optString2);
            }
        }
        if (optJSONObject2 != null) {
            JSONArray names2 = optJSONObject2.names();
            for (int i11 = 0; i11 < names2.length(); i11++) {
                String optString3 = names2.optString(i11, null);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(optString3);
                if (optString3 != null && optJSONObject3 != null) {
                    hVar.f16985b.put(optString3, new g(optJSONObject3));
                }
            }
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f16984a.equals(hVar.f16984a) && this.f16985b.equals(hVar.f16985b);
    }

    public int hashCode() {
        return this.f16984a.hashCode();
    }

    public int a(String str, int i10, int i11) {
        String num = Integer.toString(i10);
        if (this.f16984a.containsKey(str)) {
            num = this.f16984a.get(str);
        }
        try {
            i10 = Integer.parseInt(num);
        } catch (Throwable unused) {
        }
        return Math.max(i10, i11);
    }

    public boolean a(String str, boolean z10) {
        String bool = Boolean.toString(z10);
        if (this.f16984a.containsKey(str)) {
            bool = this.f16984a.get(str);
        }
        try {
            return Boolean.parseBoolean(bool);
        } catch (Throwable unused) {
            return z10;
        }
    }

    public f a(String str) {
        g gVar;
        String str2 = IAConfigManager.J.f16868d;
        if (this.f16985b.containsKey(str2)) {
            gVar = this.f16985b.get(str2);
        } else {
            gVar = new g();
        }
        gVar.getClass();
        return gVar.f16937a.containsKey(str) ? gVar.f16937a.get(str) : new f();
    }
}
