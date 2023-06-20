package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public int f16843a;

    /* renamed from: b  reason: collision with root package name */
    public int f16844b;

    /* renamed from: c  reason: collision with root package name */
    public int f16845c;

    /* renamed from: d  reason: collision with root package name */
    public long f16846d;

    public e() {
        this(0, 0, 0, System.currentTimeMillis());
    }

    public JSONObject a(boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put("time", this.f16846d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f16843a);
        if (z11) {
            jSONObject.put("com", this.f16845c);
        }
        jSONObject.put("cli", this.f16844b);
        return jSONObject;
    }

    public e(int i10, int i11, int i12, long j10) {
        this.f16846d = j10;
        this.f16843a = i10;
        this.f16844b = i11;
        this.f16845c = i12;
    }

    public static e a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("time");
        int optInt = jSONObject.optInt("cli", -1);
        int optInt2 = jSONObject.optInt("imp", -1);
        int optInt3 = jSONObject.optInt("com", -1);
        if (optLong == 0 || optInt < 0 || optInt2 < 0 || optInt3 < 0) {
            return null;
        }
        return new e(optInt2, optInt, optInt3, optLong);
    }
}
