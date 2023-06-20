package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: PlayBufferModel.java */
/* loaded from: classes.dex */
public class m implements c {

    /* renamed from: a  reason: collision with root package name */
    public long f11051a;

    /* renamed from: b  reason: collision with root package name */
    public int f11052b;

    /* renamed from: c  reason: collision with root package name */
    public long f11053c;

    public void a(long j10) {
        this.f11051a = j10;
    }

    public void b(long j10) {
        this.f11053c = j10;
    }

    public void a(int i10) {
        this.f11052b = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f11051a);
            jSONObject.put("buffers_count", this.f11052b);
            jSONObject.put("total_duration", this.f11053c);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
