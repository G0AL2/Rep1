package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: LoadVideoCancelModel.java */
/* loaded from: classes.dex */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f11037a;

    /* renamed from: b  reason: collision with root package name */
    private long f11038b;

    public i(String str, long j10) {
        this.f11037a = str;
        this.f11038b = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f11037a);
            jSONObject.put("preload_size", this.f11038b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
