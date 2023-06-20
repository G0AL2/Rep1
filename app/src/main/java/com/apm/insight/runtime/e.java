package com.apm.insight.runtime;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, e> f6610a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f6611b = null;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f6612c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6613d = false;

    /* renamed from: e  reason: collision with root package name */
    private String f6614e;

    public e(JSONObject jSONObject, String str) {
        this.f6614e = str;
        a(jSONObject);
        f6610a.put(this.f6614e, this);
        com.apm.insight.l.q.a((Object) ("after update aid " + str));
    }

    public static void a(String str, JSONObject jSONObject) {
        e eVar = f6610a.get(str);
        if (eVar != null) {
            eVar.a(jSONObject);
        } else {
            new e(jSONObject, str);
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f6611b = jSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f6613d = optJSONObject.optInt("switcher") == 1;
    }

    public static boolean b(String str) {
        return f6610a.get(str) != null;
    }

    public static JSONObject c(String str) {
        e eVar = f6610a.get(str);
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public static e d(String str) {
        return f6610a.get(str);
    }

    public static long e(String str) {
        e eVar = f6610a.get(str);
        if (eVar != null) {
            try {
                return Long.decode(com.apm.insight.l.l.b(eVar.a(), "over_all", "get_settings_interval")).longValue() * 1000;
            } catch (Throwable unused) {
                return 3600000L;
            }
        }
        return 3600000L;
    }

    public static boolean f(String str) {
        e eVar = f6610a.get(str);
        return eVar != null && eVar.b();
    }

    public static boolean g(String str) {
        e eVar = f6610a.get(str);
        return eVar != null && eVar.c();
    }

    public static boolean h(String str) {
        e eVar = f6610a.get(str);
        return eVar != null && eVar.d();
    }

    public JSONObject a() {
        return this.f6611b;
    }

    public boolean a(String str) {
        if (this.f6611b == null) {
            return false;
        }
        return this.f6613d;
    }

    public boolean b() {
        JSONObject jSONObject = this.f6611b;
        return jSONObject != null && 1 == com.apm.insight.l.l.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean c() {
        JSONObject jSONObject = this.f6611b;
        return jSONObject != null && 1 == com.apm.insight.l.l.a(jSONObject, 0, "crash_module", "switcher");
    }

    public boolean d() {
        JSONObject jSONObject = this.f6611b;
        return jSONObject != null && 1 == com.apm.insight.l.l.a(jSONObject, 0, "crash_module", "switcher");
    }
}
