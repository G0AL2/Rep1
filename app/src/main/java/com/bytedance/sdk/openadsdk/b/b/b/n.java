package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: PlayErrorModel.java */
/* loaded from: classes.dex */
public class n implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f11054a;

    /* renamed from: b  reason: collision with root package name */
    private long f11055b;

    /* renamed from: c  reason: collision with root package name */
    private int f11056c;

    /* renamed from: d  reason: collision with root package name */
    private int f11057d;

    /* renamed from: e  reason: collision with root package name */
    private String f11058e;

    public void a(long j10) {
        this.f11054a = j10;
    }

    public void b(long j10) {
        this.f11055b = j10;
    }

    public void a(int i10) {
        this.f11056c = i10;
    }

    public void b(int i10) {
        this.f11057d = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f11054a);
            jSONObject.put("total_duration", this.f11055b);
            jSONObject.put("error_code", this.f11056c);
            jSONObject.put("extra_error_code", this.f11057d);
            jSONObject.put("error_message", this.f11058e);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
