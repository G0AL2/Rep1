package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedOverModel.java */
/* loaded from: classes.dex */
public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f11029a;

    /* renamed from: b  reason: collision with root package name */
    private long f11030b;

    /* renamed from: c  reason: collision with root package name */
    private int f11031c = 0;

    public void a(long j10) {
        this.f11029a = j10;
    }

    public void b(long j10) {
        this.f11030b = j10;
    }

    public void a(int i10) {
        this.f11031c = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.f11029a);
            jSONObject.put("buffers_time", this.f11030b);
            jSONObject.put("video_backup", this.f11031c);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
