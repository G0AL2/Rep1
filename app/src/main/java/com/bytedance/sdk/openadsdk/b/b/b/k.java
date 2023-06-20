package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: LoadVideoStartModel.java */
/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f11045a;

    /* renamed from: b  reason: collision with root package name */
    private long f11046b;

    public k(String str, long j10) {
        this.f11045a = str;
        this.f11046b = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f11045a);
            jSONObject.put("preload_size", this.f11046b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
