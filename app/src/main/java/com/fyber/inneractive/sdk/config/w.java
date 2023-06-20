package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.m0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w implements m0.a {

    /* renamed from: a  reason: collision with root package name */
    public UnitDisplayType f17069a;

    @Override // com.fyber.inneractive.sdk.util.m0.a
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        m0.a(jSONObject, "unitDisplayType", this.f17069a);
        return jSONObject;
    }
}
