package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedContinueModel.java */
/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f11027a;

    /* renamed from: b  reason: collision with root package name */
    private long f11028b;

    public void a(long j10) {
        this.f11027a = j10;
    }

    public void b(long j10) {
        this.f11028b = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f11027a);
            jSONObject.put("total_duration", this.f11028b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
