package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: EndcardSkipModel.java */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f11019a;

    /* renamed from: b  reason: collision with root package name */
    private long f11020b;

    /* renamed from: c  reason: collision with root package name */
    private int f11021c;

    /* renamed from: d  reason: collision with root package name */
    private int f11022d;

    public void a(long j10) {
        this.f11019a = j10;
    }

    public void b(long j10) {
        this.f11020b = j10;
    }

    public void a(int i10) {
        this.f11021c = i10;
    }

    public void b(int i10) {
        this.f11022d = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f11019a);
            jSONObject.put("total_duration", this.f11020b);
            jSONObject.put("vbtt_skip_type", this.f11021c);
            jSONObject.put("skip_reason", this.f11022d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
