package com.ironsource.mediationsdk.sdk;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static f f27333a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f27334b = new JSONObject();

    private f() {
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            if (f27333a == null) {
                f27333a = new f();
            }
            fVar = f27333a;
        }
        return fVar;
    }

    public final synchronized String a(String str) {
        return this.f27334b.optString(str);
    }

    public final synchronized void a(String str, Object obj) {
        try {
            this.f27334b.put(str, obj);
        } catch (Exception unused) {
        }
    }

    public final synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public final synchronized JSONObject b() {
        return this.f27334b;
    }
}
