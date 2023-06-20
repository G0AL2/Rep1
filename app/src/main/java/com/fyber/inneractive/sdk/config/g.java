package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, f> f16937a = new HashMap();

    public g() {
    }

    public final void a(JSONObject jSONObject) {
        JSONArray names;
        if (jSONObject != null) {
            JSONArray names2 = jSONObject.names();
            for (int i10 = 0; i10 < names2.length(); i10++) {
                String optString = names2.optString(i10, null);
                JSONObject optJSONObject = jSONObject.optJSONObject(optString);
                f fVar = new f();
                if (optJSONObject != null && (names = optJSONObject.names()) != null) {
                    for (int i11 = 0; i11 < names.length(); i11++) {
                        String optString2 = names.optString(i11, null);
                        String optString3 = optJSONObject.optString(optString2, null);
                        if (optString2 != null && optString3 != null) {
                            fVar.f16936a.put(optString2, optString3);
                        }
                    }
                }
                this.f16937a.put(optString, fVar);
            }
        }
    }

    public g(JSONObject jSONObject) {
        a(jSONObject);
    }
}
