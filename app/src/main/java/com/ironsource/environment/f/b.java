package com.ironsource.environment.f;

import com.ironsource.environment.f.a;
import com.ironsource.mediationsdk.C1741o;
import org.json.JSONObject;
import qe.k;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f26167a;

    public b() {
        String[] strArr;
        a.C0338a c0338a = a.f26165a;
        strArr = a.f26166b;
        this.f26167a = strArr;
        new C1741o();
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject a10 = com.ironsource.environment.c.b.a(jSONObject.optJSONObject("md"));
        if (a10 != null) {
            jSONObject.put("md", a10);
        }
        return jSONObject;
    }

    public final JSONObject a() {
        JSONObject a10 = C1741o.a(this.f26167a);
        k.e(a10, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a10);
    }
}
