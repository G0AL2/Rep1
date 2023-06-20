package com.bytedance.sdk.openadsdk.core.c.a;

import com.bytedance.sdk.component.e.d.c;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DynamicAppInfo.java */
/* loaded from: classes.dex */
public class b {
    private List<String> b() {
        return Arrays.asList(c.c1657027613239dc("aqrJjci"), c.c1657027613239dc("aeKmbj"), c.c1657027613239dc("gdvWahvki}oBbka"));
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put(c.c1657027613239dc("aqrMehc"), com.bytedance.sdk.openadsdk.common.a.a());
            jSONObject.put(c.c1657027613239dc("iolfvDvwFhgn"), com.bytedance.sdk.openadsdk.common.a.e());
            jSONObject.put(c.c1657027613239dc("ahf"), com.bytedance.sdk.openadsdk.common.a.b());
            jSONObject.put(c.c1657027613239dc("seiF`lrngg"), com.bytedance.sdk.openadsdk.common.a.c());
            jSONObject.put(c.c1657027613239dc("aqrUawungg"), com.bytedance.sdk.openadsdk.common.a.d());
            jSONObject.put(c.c1657027613239dc("ndvW}uc"), com.bytedance.sdk.openadsdk.common.a.f());
            jSONObject.put(c.c1657027613239dc("strskwrKaz~"), jSONArray);
            jSONObject.put(c.c1657027613239dc("ddtjg`Oc"), com.bytedance.sdk.openadsdk.common.a.a(m.a()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
