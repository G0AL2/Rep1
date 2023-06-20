package com.bytedance.sdk.openadsdk.b.a;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventStartListenerWrapper.java */
/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    b f11005a;

    @Override // com.bytedance.sdk.openadsdk.b.a.b
    public void a(JSONObject jSONObject) throws JSONException {
        b bVar = this.f11005a;
        if (bVar != null) {
            bVar.a(jSONObject);
        }
        jSONObject.put("event_ts", System.currentTimeMillis());
    }
}
