package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedBreakModel.java */
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public long f11023a;

    /* renamed from: b  reason: collision with root package name */
    public long f11024b;

    /* renamed from: c  reason: collision with root package name */
    public int f11025c;

    /* renamed from: d  reason: collision with root package name */
    public int f11026d = 0;

    public void a(long j10) {
        this.f11023a = j10;
    }

    public void b(long j10) {
        this.f11024b = j10;
    }

    public void a(int i10) {
        this.f11025c = i10;
    }

    public void b(int i10) {
        this.f11026d = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.f11023a);
            jSONObject.put("buffers_time", this.f11024b);
            jSONObject.put("break_reason", this.f11025c);
            jSONObject.put("video_backup", this.f11026d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
