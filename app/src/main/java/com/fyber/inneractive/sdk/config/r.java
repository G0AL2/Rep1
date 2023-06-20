package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.m0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r implements m0.a {

    /* renamed from: a  reason: collision with root package name */
    public Integer f17017a = null;

    /* renamed from: b  reason: collision with root package name */
    public UnitDisplayType f17018b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f17019c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f17020d;

    @Override // com.fyber.inneractive.sdk.util.m0.a
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        m0.a(jSONObject, "refresh", this.f17017a);
        m0.a(jSONObject, "unitDisplayType", this.f17018b);
        m0.a(jSONObject, "close", this.f17019c);
        m0.a(jSONObject, "hideDelay", this.f17020d);
        return jSONObject;
    }
}
