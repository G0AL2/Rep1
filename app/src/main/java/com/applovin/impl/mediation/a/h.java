package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.m;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends f {
    public h(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        super(map, jSONObject, jSONObject2, mVar);
    }

    public boolean a() {
        return b("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    @Override // com.applovin.impl.mediation.a.f
    public String toString() {
        return "SignalProviderSpec{adObject=" + J() + '}';
    }
}
