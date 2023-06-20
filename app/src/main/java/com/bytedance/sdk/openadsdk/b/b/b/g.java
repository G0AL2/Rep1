package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedPauseModel.java */
/* loaded from: classes.dex */
public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f11032a;

    /* renamed from: b  reason: collision with root package name */
    private long f11033b;

    public void a(long j10) {
        this.f11032a = j10;
    }

    public void b(long j10) {
        this.f11033b = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.f11032a);
            jSONObject.put("total_duration", this.f11033b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
