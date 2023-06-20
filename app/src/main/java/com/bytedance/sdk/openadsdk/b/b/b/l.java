package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: LoadVideoSuccessModel.java */
/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f11047a;

    /* renamed from: b  reason: collision with root package name */
    private long f11048b;

    /* renamed from: c  reason: collision with root package name */
    private long f11049c;

    /* renamed from: d  reason: collision with root package name */
    private long f11050d;

    public void a(String str) {
        this.f11047a = str;
    }

    public void b(long j10) {
        this.f11049c = j10;
    }

    public void c(long j10) {
        this.f11050d = j10;
    }

    public void a(long j10) {
        this.f11048b = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f11047a);
            jSONObject.put("preload_size", this.f11048b);
            jSONObject.put("load_time", this.f11049c);
            jSONObject.put("local_cache", this.f11050d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
