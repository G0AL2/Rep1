package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.m0;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c0 implements m0.a {

    /* renamed from: a  reason: collision with root package name */
    public Integer f16920a = 50;

    /* renamed from: b  reason: collision with root package name */
    public Integer f16921b = 50;

    /* renamed from: c  reason: collision with root package name */
    public Set<Vendor> f16922c = null;

    @Override // com.fyber.inneractive.sdk.util.m0.a
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        m0.a(jSONObject, "pausePct", this.f16920a);
        m0.a(jSONObject, "playPct", this.f16921b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f16922c;
        if (set != null) {
            for (Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        m0.a(jSONObject, "vendor", jSONArray);
        return jSONObject;
    }

    public Integer b() {
        return this.f16921b;
    }

    public Set<Vendor> c() {
        return this.f16922c;
    }
}
